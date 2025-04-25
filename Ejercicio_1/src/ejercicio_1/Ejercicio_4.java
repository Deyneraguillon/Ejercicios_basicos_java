
package ejercicio_1;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa tu temperatura actual en centigrados: ");
        double temperatura = scanner.nextDouble();
        
        if (temperatura >= 18 && temperatura<=25){
            System.out.println(" La temperatura es adecuada ");   
        }else{
            System.out.println(" La temperatura esta fuera del rango permitido ");
        }
        scanner.close();
    }
    
    
}
