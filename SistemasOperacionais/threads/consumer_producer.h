#ifndef _CONSUMER_PRODUCER_H_
#define _CONSUMER_PRODUCER_H_

#include <stdbool.h>
#include "fila.h"

struct worker_args {
    struct fila * armazem;
    bool producer_finalizou;
};

void * producer_worker(void *);
void * consumer_worker(void *);

#endif
