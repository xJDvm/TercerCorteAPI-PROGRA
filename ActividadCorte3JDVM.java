import java.util.Scanner;

public class ActividadCorte3JDVM {   
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        int preescolar=0, primaria=0, bachiller=0;

            System.out.print("Presione cualquier numero para agregar. Presione 0 para terminar: ");
            int ciclo = sc.nextInt();
            
            while (ciclo != 0){
                System.out.print("Que edad tiene el estudiante: ");
                int edad = sc.nextInt();
                
                if (edad >= 3 && edad <= 5 ){
                    preescolar ++;
                    System.out.println("El estudiante es de preescolar");
                }
                else if (edad >= 6 && edad <= 11){
                    primaria ++;
                    System.out.println("El estudiante es de primaria");
                }
                else if (edad >= 12 && edad <= 17 ){
                    bachiller ++;
                    System.out.println("El estudiante es de bachiller");
                }
                else {
                    System.out.println("La edad ingresada es está fuera de los límites.");
                }
                System.out.println("Presione cualquier numero si quiere continuar. Presione 0 si quiere detener el programa: ");
                ciclo = sc.nextInt();
            }
        System.out.println("El programa termino.");
        System.out.println("El tota de estudiantes es igual: " + (preescolar+primaria+bachiller));
        System.out.println(" Estudiantes de preescolar: "+ preescolar + "\n Estudiantes de primaria: " + primaria + "\n Estudiantes de bachillerato: " + bachiller);
    }
}