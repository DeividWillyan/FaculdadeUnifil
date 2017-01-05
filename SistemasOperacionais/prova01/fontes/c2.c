#include <stdio.h>
#include <stdlib.h>

void func1() {
if(0)
printf("Era verdade... \n " );
else
printf("Verificada falha. \n " );
}

void func2() {
int a = 10, b = 45, c, * p1, * p2;
p1 = &b;
b = a + (*p1);
p2 = p1;
c = a * (*p1) + (*p2);
p2 = &a;
p1 = &c;
*p2 = a + (*p1);
printf("a: %d, b: %d, c: %d \n " , a, b, c);
}

int main() {

// func1();
 func2();

}

