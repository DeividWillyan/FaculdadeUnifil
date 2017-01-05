#include <pthread.h> 
#include <stdio.h> 
#include <stdlib.h> 
#define NUM_THREADS  10 

void *ola_thread(void *tid) { 
   
   /* Essa função escreve o ID da thread e termina */ 
	long t;
	t = (long)tid;
	printf("Ola Mundo! Saudacoes da thread %d0\n", t); 
    pthread_exit(NULL);

} 

int main(int argc, char * argv[]){ 
    /* O programa principal cria 10 threads e termina */ 
    pthread_t threads[NUM_THREADS]; 
    int erro, i; 
    for (i = 0; i < NUM_THREADS; i++){ 
        printf("Main no controle. Criando thread %d0...\n", i); 
        erro = pthread_create(&threads[i], NULL, ola_thread, (void *)&i ); 
        if (erro){ 
            printf("Opa, pthread_create retornou o codigo de erro %d0\n", erro); 
            exit(1); 
        } 
    } 
    pthread_exit(NULL); 
} 

