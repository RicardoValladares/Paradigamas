#ifdef WIN32
   #include <conio.h> //Solo si se compila para Windows se usa este header
#endif
#include <stdio.h>
int main(){
   float n1, n2, total;
   char signo;
   printf("Ingrese un numero: ");
   scanf("%f", &n1);
   printf("Ingrese un numero: ");
   scanf("%f", &n2);
   printf("Ingrese un signo: ");
   scanf("%1s", &signo);
   if(signo=='-'){ total=n1-n2; }
   else if(signo=='+'){ total=n1+n2; }
   else if(signo=='*'){ total=n1*n2; }
   else if(signo=='/'){ total=n1/n2; }
   else{ total = 0.0; }
   printf("total=%.2f \n",total);
   #ifdef WIN32
      getch();
   #else
      getchar();
   #endif
   return 0;
}