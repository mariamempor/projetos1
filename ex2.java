
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    int anoNascimento;
    int anoAtual;
    System.out.println("Qual é o seu ano de nascimento? ");
    anoNascimento = scanner.nextInt();
    
    System.out.println("Em que ano estamos? ");
    anoAtual = scanner.nextInt();
    
    int idade = anoAtual - anoNascimento;
    System.out.println("A sua idade é: " + idade);
    
    
        
    }
    
}
