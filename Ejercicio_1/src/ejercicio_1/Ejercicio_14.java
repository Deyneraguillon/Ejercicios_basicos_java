
package ejercicio_1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_14 {
     private int numeroAleatorio;
    private int intentos;

    public Ejercicio_14() {
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(100) + 1; 
        this.intentos = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int adivinanza;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (adivinanza != numeroAleatorio);

        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio_14 juego = new Ejercicio_14();
        juego.jugar();
    }
    
}
