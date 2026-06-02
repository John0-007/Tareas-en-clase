
public class Estudiante {
   private String nombre;
   private int edad;
   private double IndiceAcademico;

   public Estudiante(String var, int var1, double var2) {
      this.nombre = var;
      this.edad = var1;
      this.IndiceAcademico = var2;
   }

   public String getNombre() {
      return this.nombre;
   }

   public int getEdad() {
      return this.edad;
   }

   public double getIndiceAcademico() {
      return this.IndiceAcademico;
   }
}
