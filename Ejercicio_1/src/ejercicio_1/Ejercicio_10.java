
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Puntos iniciales de los equipos
        int puntosEquipoA = 0;
        int puntosEquipoB = 0;

        while (true) {
            // Solicitar el resultado del partido al usuario
            System.out.print("Ingrese el resultado del partido (ganado, perdido, empatado o salir para terminar): ");
            String resultado = scanner.nextLine().toLowerCase();

            // Determinar la acción según el resultado del partido
            switch (resultado) {
                case "ganado":
                    puntosEquipoA += 3;  // Asignar 3 puntos por partido ganado
                    System.out.println("Equipo A ha ganado. Puntos totales: " + puntosEquipoA);
                    break;
                case "perdido":
                    puntosEquipoB += 3;  // Asignar 3 puntos al equipo contrario por partido perdido
                    System.out.println("Equipo B ha ganado. Puntos totales: " + puntosEquipoB);
                    break;
                case "empatado":
                    puntosEquipoA += 1;  // Asignar 1 punto por partido empatado
                    puntosEquipoB += 1;
                    System.out.println("El partido terminó empatado. Puntos totales: Equipo A - " + puntosEquipoA + ", Equipo B - " + puntosEquipoB);
                    break;
                case "salir":
                    System.out.println("Saliendo del sistema de clasificación...");
                    System.out.println("Clasificación final: Equipo A - " + puntosEquipoA + ", Equipo B - " + puntosEquipoB);
                    return;  // Salir del programa
                default:
                    System.out.println("Resultado no válido. Por favor, ingrese 'ganado', 'perdido', 'empatado' o 'salir'.");
                    break;
            }
        }
    }
}
    

