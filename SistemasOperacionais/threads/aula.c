#include <stdlib.h>

struct Fila {
	int espaco[20];
	int prox, ult;
};

void enfileirar(struct Fila * This, int elem) {
	This->ult = This->ult == 20 ? 0 : This->ult +1;
	This->espaco[This->ult] = elem;
}

int desenfileirar(struct Fila * This) {
	This->prox = This->prox == 20 ? 0 : This->prox +1;
	return This->espaco[This->prox];

}

void crate_Fila(struct Fila ** This) {
	*This = (struct Fila *) malloc(sizeof(struct Fila));
}

int main() {
	return 0;

}

