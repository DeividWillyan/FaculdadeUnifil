#include <stdio.h>
#include <stdlib.h>

void aux(int * vals, int len) {

   while (len > 0) {
      len--;
      vals[len-1] += *(vals + len);
   }

}

void func3() {
   
   int n[] = { 1, 2, 3, 4, 5 };
   aux(n, 3);
   printf("%d" , n[0]);
   // faltando ponto e virgula no fim da linha print

}

int main() {

   func3();

}


