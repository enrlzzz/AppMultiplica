package appmultiplica;

import java.util.Scanner;

public class AppMultiplica {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bem vindo ao appMultiplica!");
        System.out.println("Digite dois numeros para serem multiplicados");
        
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        
        int multi = num1 * num2;
        
        System.out.println("O resultado da multiplicacao e: " + multi);
    }
    
}
