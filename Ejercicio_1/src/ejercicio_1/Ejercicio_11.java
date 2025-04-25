
package ejercicio_1;

import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menú del restaurante
        String[] platos = {"1. Ensalada - $5.00", "2. Sopa - $3.00", "3. Pizza - $8.00"};
        String[] bebidas = {"1. Agua - $1.00", "2. Refresco - $2.00", "3. Café - $1.50"};
        double[] preciosPlatos = {5.00, 3.00, 8.00};
        double[] preciosBebidas = {1.00, 2.00, 1.50};
        
        // Mostrar el menú
        System.out.println("Menú del Restaurante:");
        System.out.println("Platos:");
        for (String plato : platos) {
            System.out.println(plato);
        }
        
        System.out.println("Bebidas:");
        for (String bebida : bebidas) {
            System.out.println(bebida);
        }
        
        // Selección de platos
        double costoTotal = 0.0;
        System.out.println("Seleccione su plato (0 para finalizar):");
        while (true) {
            int seleccion = scanner.nextInt();
            if (seleccion == 0) {
                break;
            }
            if (seleccion >= 1 && seleccion <= 3) {
                costoTotal += preciosPlatos[seleccion - 1];
            } else {
                System.out.println("Selección no válida. Intente de nuevo.");
            }
        }
        
        // Selección de bebidas
        System.out.println("Seleccione su bebida (0 para finalizar):");
        while (true) {
            int seleccion = scanner.nextInt();
            if (seleccion == 0) {
                break;
            }
            if (seleccion >= 1 && seleccion <= 3) {
                costoTotal += preciosBebidas[seleccion - 1];
            } else {
                System.out.println("Selección no válida. Intente de nuevo.");
            }
        }
        
        // Solicitar método de pago
        System.out.println("Seleccione el método de pago (1. Efectivo, 2. Tarjeta de crédito, 3. Cheque):");
        int metodoPago = scanner.nextInt();
        double descuento = 0.0;
        
        // Aplicar descuento según el método de pago
        switch (metodoPago) {
            case 1:
                descuento = 0.10; // 10% de descuento por pago en efectivo
                break;
            case 2:
                descuento = 0.05; // 5% de descuento por pago con tarjeta de crédito
                break;
            case 3:
                descuento = 0.02; // 2% de descuento por pago con cheque
                break;
            default:
                System.out.println("Método de pago no válido. No se aplicará descuento.");
                break;
        }
        
        // Calcular el costo total con descuento
        double totalConDescuento = costoTotal - (costoTotal * descuento);
        
        // Mostrar el costo total y el descuento aplicado
        System.out.printf("Costo total: $%.2f\n", costoTotal);
        System.out.printf("Descuento aplicado: %.0f%%\n", descuento * 100);
        System.out.printf("Total con descuento: $%.2f\n", totalConDescuento);
    }
}
    

