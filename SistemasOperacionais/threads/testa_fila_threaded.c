#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

#include "fila.h"
#include "consumer_producer.h"

#define SUCESSO 0
#define FALHA !(SUCESSO)


// este é um metodo do  tipo inteiro que  retorna um inteiro, ele faz o enfileiramento e
// faz o desenfileiramento, recebe como paramentro um parametro tipo fila, e a quantidade de incrementos
// que será realizado.
int enfileira_desenfileira(struct fila * fila, int qtde) {
    for (int i = 0; i < qtde; ++i)
        enfileirar(fila, i);

    for (int i = 0; i < qtde; ++i)
        if (i != desenfileirar(fila))
            return FALHA;

    return SUCESSO;
}

//  metodo do tipo inteiro.
int teste_monothreaded() {
    const int tamanho_maximo = 1 << 4;
	// criamos o objeto teste que é tipo fila, e alocamos ele na memoria.
    struct fila * teste = (struct fila *)malloc(sizeof(struct fila));

	// chamamos o metodo create_fila que recebe o objeto teste e o tamanho maximo.
    create_fila(teste, tamanho_maximo);
	// cria treis variaveis do inteiro que recebe o retorno dos tres testes realidos.
    int teste1 = enfileira_desenfileira(teste, tamanho_maximo / 3);
    int teste2 = enfileira_desenfileira(teste, tamanho_maximo / 2);
    int teste3 = enfileira_desenfileira(teste, tamanho_maximo);

	//chama o metodo destroy_fila, da classe fila.h, este metodo tira da memoria o objeto teste.
    destroy_fila(teste);
	// usamos o comando free para remover agora a pilha teste da memoria.
    free(teste);

    int ret_code = SUCESSO;
	// faz a verificação se todos os testes foram realizados com sucesso!
    if (teste1 == FALHA || teste2 == FALHA || teste3 == FALHA) {
        printf("Fila nao passou no teste monothreaded.\n");
        ret_code = FALHA;
    }
	// retorna zero caso todos os testes tenham sido feitos com sucesso!
    return ret_code;
}

int teste_multithreaded(int num_consumers) {
    pthread_attr_t joinable;
    pthread_attr_init(&joinable);
    pthread_attr_setdetachstate(&joinable, PTHREAD_CREATE_JOINABLE);
    pthread_t * thread = (pthread_t*) calloc(num_consumers+1, sizeof(pthread_t));

    struct worker_args * args = (struct worker_args *) malloc(sizeof(struct worker_args));
    args->armazem = (struct fila *)malloc(sizeof(struct fila));
    create_fila(args->armazem, 10);
    args->producer_finalizou = false;

    int err = pthread_create(&thread[0], &joinable, &producer_worker, (void *)args);
    if (err) {
        printf("Erro %d na criacao da thread producer.\n", err);
    }
    for (int i = 1; i < num_consumers+1; i++) {
        int err = pthread_create(&thread[i], &joinable, &consumer_worker, (void *)args);
        if (err) {
            printf("Erro %d na criacao da thread worker %d.\n", err, i);
        }
    }

    pthread_attr_destroy(&joinable);

    for (int i = 0; i < num_consumers+1; i++) {
        int err = pthread_join(thread[i], NULL);
        if (err) {
            printf("Erro %d na juncao com a thread %d.\n", err, i);
        }
    }

    destroy_fila(args->armazem);
    free(args->armazem);
    free(args);
    free(thread);

    return SUCESSO;
}

int main(int argc, char * argv[]) {
    teste_monothreaded();
    teste_multithreaded(2);

    return 0;
}
