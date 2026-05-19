
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMedico {
    static ArrayList<Paciente> paciente = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void main() {
        int opcion;

        do { 
            System.out.println("\n--- SISTEMA MEDICO ---");
            System.out.println("1. Registar Paciente");
            System.out.println("2. Mostar informacion ");
            System.out.println("3. Calcular IMC");
            System.out.println("4. Determinar estado del paciente ");
            System.out.println("5. Mostrar todos los pacientes ");
            System.out.println("6. Salir ");
            opcion = LeerEntero();

            if(opcion == 1){
                Registrar();
            }
            else if (opcion == 2){
                Paciente p = elegirPaciente();
                if(p != null){
                    p.mostar();
                }
            }else if(opcion == 3){
                Paciente p = elegirPaciente();
                if(p != null){
                    System.out.println("IMC: " + String.format("%2.f", p.calcularIMC()));
                }
            }else if(opcion == 4){
                Paciente p = elegirPaciente();
                if(p != null){
                    System.out.println("Estado: " + p.Clasificacion());
                }
            }else if(opcion == 5){
                if(paciente.isEmpty()){
                    System.out.println("No hay pacientes registrados");
                }else{
                    for(Paciente p : paciente){
                        p.mostar();
                    }
                }
            }else if(opcion == 6){
                System.out.println("Saliendo del sistema...");
                break;
            }else{
                System.out.println("Opcion incorrecta.");
        }
        } while (opcion != 6);
    }   

    

    


     
    static void Registrar(){
         
   
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Edad: ");
        int edad = LeerEntero();

        System.out.println("Peso (kg): ");
        double peso = leerDecimal();

        System.out.println("Altura: ");
        double altura = leerDecimal();

        paciente.add(new Paciente(nombre, peso, edad, altura));
        System.out.println("Paciente Regitrado");
    }
    static Paciente elegirPaciente(){
        if(paciente.isEmpty()){
            System.out.println("No hay pacientes registrados ");
            return null;
        }
        for (int i = 0; i< paciente.size(); i++){
            System.out.println((i + 1) + " . " + paciente.get(i));
            
        }
        System.out.println("Numero del paciente: ");
        int n = LeerEntero();
        if(n < 1 || n > paciente.size()){
            System.out.println("Numero invalido");
            return null;
        }
        return paciente.get(n - 1);
        
    }
    static int LeerEntero(){
        while (true){
            try {
              return Integer.parseInt(sc.nextLine().trim()); 
            } catch(Exception e){
                System.out.println("Numero invalido");
            }
        }
            }
            static double leerDecimal() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.print("Numero invalido, intente de nuevo: ");
            }
        }
    
            }
        }
        
    




