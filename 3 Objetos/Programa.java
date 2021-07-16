public class Programa{
   public static void main (String args[]){
      /*creamos arreglo del objeto alumnos con solo dos alumnos*/
      Alumno alumnos[]=new Alumno[2];
      alumnos[0] = new Alumno("Ricardo","Valladares","VR201104");
      alumnos[1] = new Alumno("Veronica","Arias","AQ201104");
      /*mostramos los alumnos*/
      for (int i=0;i<alumnos.length;i++){
         System.out.println("");
         alumnos[i].Mostrar_Nombre_Completo_y_NIE_en_Consola();
      }
   }
}