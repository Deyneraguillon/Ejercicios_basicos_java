
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura actual:");
        double temperaturaActual = scanner.nextDouble();
        
        System.out.println("Ingrese el umbral de alerta:");
        double umbralAlerta = scanner.nextDouble();
        
        if (temperaturaActual > umbralAlerta) {
            System.out.println("¡Alerta! La temperatura está por encima del umbral de alerta.");
        } else {
            System.out.println("La temperatura es normal.");
        }
        
        scanner.close();

}
    }

