
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_12 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
           
            System.out.print("Ingrese la distancia total del viaje (en kilómetros): ");
            double distancia = scanner.nextDouble();

           
            System.out.print("Ingrese la velocidad promedio del coche (en km/h): ");
            double velocidad = scanner.nextDouble();

            
            double tiempoEstimado = distancia / velocidad;
            System.out.println("El tiempo estimado de viaje es: " + tiempoEstimado + " horas.");

            
            System.out.print("¿Desea hacer otro viaje? (si/no): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("si"));

        scanner.close();
    }
    
}
