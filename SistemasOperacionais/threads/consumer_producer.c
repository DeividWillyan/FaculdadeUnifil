#include <stdio.h>
#include "consumer_producer.h"

void * producer_worker(void * data) {
    struct worker_args * args = (struct worker_args *) data;

    printf("Producer inicializado. Qtd %d, Max %d.\n",
        qtde_enfileirada(args->armazem), args->armazem->max_elems);

    int prod_total = args->armazem->max_elems * 4;
    int prod = 0;
    do {
        if (!cheia(args->armazem)) {
            // Enfileira 4 de uma vez para dar chance a workers concorrentes
            enfileirar(args->armazem, prod++);
            enfileirar(args->armazem, prod++);
            enfileirar(args->armazem, prod++);
            enfileirar(args->armazem, prod++);

            printf("Enfileirados %d a %d. Qtd %d, Max %d.\n", prod-4, prod-1,
                qtde_enfileirada(args->armazem), args->armazem->max_elems);
        }
    } while (prod < prod_total);

    args->producer_finalizou = true;
    printf("Producer terminado.\n");
    return 0;
}

void * consumer_worker(void * data) {
    struct worker_args * args = (struct worker_args *) data;

    printf("Consumer inicializado.\n");

    while (!args->producer_finalizou || !vazia(args->armazem)) {

        // Simulacao de um trabalho pesado que consome o trabalhador
        for (int ocupado = 1<<30; ocupado > 0; ocupado--);

        if (!vazia(args->armazem)) {
            printf("%d\n", desenfileirar(args->armazem));
        }
    }

    printf("Consumer terminado.\n");
    return 0;
}
