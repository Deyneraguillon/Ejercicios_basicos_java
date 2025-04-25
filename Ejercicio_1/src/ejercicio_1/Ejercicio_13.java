
package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_13 {
    private int numero;

    public Ejercicio_13(int numero) {
        this.numero = numero;
    }

    public void iniciarCuentaRegresiva() {
        while (numero >= 0) {
            System.out.println(numero);
            numero--;
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("La cuenta regresiva fue interrumpida.");
            }
        }
        System.out.println("¡Tiempo cumplido!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo para iniciar la cuenta regresiva: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser entero positivo. Inténtalo de nuevo.");
        } else {
            Ejercicio_13 ejercicio = new Ejercicio_13(numero);
            ejercicio.iniciarCuentaRegresiva();
        }

        scanner.close();
    }
}


    

