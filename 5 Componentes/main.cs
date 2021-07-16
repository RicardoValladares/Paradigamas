using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Voz;
namespace Texto2Voz{
   class Program{
      static void Main(string[] args){
         //Libreria que es como una caja negra
         Audio Sonido = new Audio("Hola Mundo");
         bool Ejecucion = Sonido.Hablar();
         //Funciones propias de C# para consola
         Console.WriteLine("Ejecucion exitosa? {0}", Ejecucion);
         Console.ReadKey();
      }
   }
}