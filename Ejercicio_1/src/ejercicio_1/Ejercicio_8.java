
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso y altura al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);
        
        // Determinar la categoría del IMC
        String categoria;

        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        // Mostrar el resultado
        System.out.printf("Su IMC es: %.2f\n", imc);
        System.out.println("Categoría de IMC: " + categoria);
    }
}
    

