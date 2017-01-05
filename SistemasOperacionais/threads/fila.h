#ifndef _FILA_H_
#define _FILA_H_

#include <stdbool.h>

struct fila {
    int * espaco;
    int prox, ult;
    int max_elems;
    int qtde;
};

void create_fila(struct fila *, size_t);
void destroy_fila(struct fila *);

void enfileirar(struct fila *, int);
int desenfileirar(struct fila *);

void fila2str(struct fila *, char *);

int qtde_enfileirada(struct fila *);
bool cheia(struct fila *);
bool vazia(struct fila *);

#endif
