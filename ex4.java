
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
       int num1;
        int num2;

        System.out.println("digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número ");
        num2 = scanner.nextInt();

        double maximo = Math.max(num1, num2);

        System.out.println("O maior dos números é: " + maximo);  
    }
    
}
