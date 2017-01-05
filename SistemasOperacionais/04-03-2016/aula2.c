#include <stdio.h>
#include <string.h>

#define FALSE 0
#define TRUE !FALSE

/*

    V0.2 Scanf no metodo ponteiros.

*/

void ponteiros() {

    int a = 5;
    int b = 30;
    int c = 60;
 
    scanf("%d", &a);
   
    int * p1 = &a;
    int * p2 = &b;
    int * p3 = p2;

    a = *p1 + b;
    b = *p2 + *p3;
    
    p2 = &c;
    *p2 = *p1 + b;

    *p1 = *p1 + *p2 + *p3;

    printf("%d, %d, %d\n", a, b, c);

}

/*----------------------------------------*/

int main(int argc, char * argv[]) {
    ponteiros();
    return 0;
}

/*----------------------------------------*/


