
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double num1;
        double num2;
        double num3;
        
        System.out.println("Digite um primeiro numero: ");
        num1 = scanner.nextDouble();
        
        System.out.println("Digite um segundo numero: ");
        num2 = scanner.nextDouble();
        
        System.out.println("Digite um terceiro numero");
        num3 = scanner.nextDouble();
        
        double x;
        if(num2 < num1){
           x = num1;
           num1 = num2;
           num2 = x;
        }
        if (num3 < num1){
            x = num1;
            num1 = num3;
            num3 = x;
        }
        if (num3< num2){
            x = num2;
            num2 = num3;
            num3 = x;
        }
        System.out.println("Os três números em ordem crescente são:");
        System.out.println(num1 + ", " + num2 + ", " + num3);
        
    }
    
}
