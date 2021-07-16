public class Alumno extends Persona{ //Heredamos del objeto Persona codigo
   /*Atributo exclusivo del objeto Alumno*/
   private String NIE;
   /*Inicializado del objeto*/
   public Alumno() {
      super();
   }
   public Alumno(String Nombres_Alumno, String Apellidos_Alumno, String NIE) {
      super(Nombres_Alumno, Apellidos_Alumno);
      this.NIE = NIE;
   }
   /*Metodos de Retorno de Variable*/
   public String getNIE() {
      return NIE;
   }
   /*Metodos de Alteracion de Variable*/
   public void setNIE(String NIE) {
      this.NIE = NIE;
   }
   /*Metodo para Mostrar Nombre Completo y NIE en consola*/
   public void Mostrar_Nombre_Completo_y_NIE_en_Consola(){
      Mostrar_Nombre_Completo_en_Consola();
      System.out.println("NIE: "+getNIE());
   }
}