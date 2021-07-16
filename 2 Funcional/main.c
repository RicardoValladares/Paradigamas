#ifdef WIN32
   #include <conio.h> //Solo si se compila para Windows se usa este header
#endif
#include <stdio.h>
float function_calculadora(float n1, float n2, char signo){
   float total;
   if(signo=='-'){ total=n1-n2; }
   else if(signo=='+'){ total=n1+n2; }
   else if(signo=='*'){ total=n1*n2; }
   else if(signo=='/'){ total=n1/n2; }
   else{ total = 0.0; }
   return total;
}

int main(){
   float n1, n2, total;
   char signo;
   printf("Ingrese un numero: ");
   scanf("%f", &n1);
   printf("Ingrese un numero: ");
   scanf("%f", &n2);
   printf("Ingrese un signo: ");
   scanf("%1s", &signo);
   total = function_calculadora(n1,n2,signo);
   printf("total=%.2f \n",total);
   #ifdef WIN32
      getch();
   #else
      getchar();
   #endif
   return 0;
}