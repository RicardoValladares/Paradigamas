public class Persona {
   /*Atributos del objeto Persona*/
   private String Nombres;
   private String Apellidos;
   /*Inicializado del objeto*/
   public Persona(){
      this.Nombres = "";
      this.Apellidos = "";
   }
   public Persona(String Nombres, String Apellidos) {
      this.Nombres = Nombres;
      this.Apellidos = Apellidos;
   }
   /*Metodos de Retorno de Variable*/
   public String getNombres() {
      return Nombres;
   }
   public String getApellidos() {
      return Apellidos;
   }
   /*Metodos de Alteracion de Variable*/
   public void setNombres(String Nombres) {
      this.Nombres = Nombres;
   }
   public void setApellidos(String Apellidos) {
      this.Apellidos = Apellidos;
   }
   /*Metodo para Mostrar Nombre Completo en consola*/
   public void Mostrar_Nombre_Completo_en_Consola(){
      System.out.println("Nombre: "+getNombres()+" "+getApellidos());
   }
}