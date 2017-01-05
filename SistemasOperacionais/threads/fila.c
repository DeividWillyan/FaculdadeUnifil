#include <stdlib.h>

#include "fila.h"

static int incr_lim(int val, int lim) {
    val++;
    return val < lim ? val : 0;
}

void create_fila(struct fila * this, size_t max_elems) {
    this->max_elems = max_elems;
    this->qtde = 0;
    this->ult = this->prox = 0;
    this->espaco = (int *) calloc(max_elems, sizeof(int));
}

void destroy_fila(struct fila * this) {
    free(this->espaco);
}

void enfileirar(struct fila * this, int elem) {
    this->qtde++;
    this->espaco[this->ult] = elem;
    this->ult = incr_lim(this->ult, this->max_elems);
}

int desenfileirar(struct fila * this) {
    this->qtde--;
    int desenfileirado = this->espaco[this->prox];
    this->prox = incr_lim(this->prox, this->max_elems);
    return desenfileirado;
}

int qtde_enfileirada(struct fila * this) {
    return this->qtde;
}

bool cheia(struct fila * this) {
    return qtde_enfileirada(this) == this->max_elems;
}

bool vazia(struct fila * this) {
    return this->ult == this->prox;
}
