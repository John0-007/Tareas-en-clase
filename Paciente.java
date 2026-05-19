public class Paciente{
    private String nombre;
    private double peso;
    private int edad;
    private double altura;

    public Paciente(String nombre, double peso, int edad, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.altura = altura;
    }

    double calcularIMC() {
        return peso / (altura * altura);
    }
    String Clasificacion(){
        double imc = calcularIMC();
        if(imc < 18.5 ) return "PESO BAJI";
        else if (imc < 25) return "PESO NORMAL";
        else return "SOBREPESO";
        
    }
    void mostar(){
        System.out.println(nombre + "| Edad: " + edad + "| Peso: " + peso + "kg " + "Altura" + altura + " m  | IMC: " 
            + String.format("%2.f", calcularIMC()) + "(" + Clasificacion() + ")" );
         
    }
}