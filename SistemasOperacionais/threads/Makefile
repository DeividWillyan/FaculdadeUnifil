CC=clang
CFLAGS=-c -Wall
LDFLAGS=-lpthread
NAME=testa_fila

all: $(NAME)
	$(info Para rodar, use o comando: ./$(NAME))

$(NAME): testa_fila_threaded.o fila.o consumer_producer.o
	$(CC) $(LDFLAGS) -o $(NAME) $^

testa_fila_threaded.o: testa_fila_threaded.c consumer_producer.h fila.h
	$(CC) $(CFLAGS) testa_fila_threaded.c

fila.o: fila.c fila.h
	$(CC) $(CFLAGS) fila.c

consumer_producer.o: consumer_producer.c consumer_producer.h fila.h
	$(CC) $(CFLAGS) consumer_producer.c

clean:
	rm *.o $(NAME)
