
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1;
        
        System.out.println("Digite um número inteiro: ");
        num1 = scanner.nextInt();
        
        if (num1 % 2 == 0 ){
            System.out.println("O número é par");
        }else {
            System.out.println("O número é ímpar");
        }
        
    }
    
}
