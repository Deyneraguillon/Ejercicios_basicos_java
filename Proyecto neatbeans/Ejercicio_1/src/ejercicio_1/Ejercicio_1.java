
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int pisoMinimo = 1;
        int pisoMaximo = 10;
        
        int pesoMaximo = 1000;
        
        System.out.print("Ingrese el piso al que desea ir (1-10): ");
        int pisoDeseado = scanner.nextInt();
        
        System.out.print("Ingrese el peso  (kg): ");
        int pesoTotal = scanner.nextInt();
        
       
        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
            if (pesoTotal <= pesoMaximo) {
                System.out.println("Moviendo el ascensor al piso " + pisoDeseado + "...");
               
                System.out.println("El ascensor ha llegado al piso " + pisoDeseado + ".");
            } else {
                System.out.println("Error: Peso excede el límite máximo de " + pesoMaximo + " kg. Por favor, reduzca el peso.");
            }
        } else {
            System.out.println("Error: Piso no válido. Por favor, ingrese un piso entre " + pisoMinimo + " y " + pisoMaximo + ".");
        }
        
        scanner.close();
    }
}


