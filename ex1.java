
package listadeexerciciospsc1;

import java.util.Scanner;



public class ex1 {

    public static void main(String[] args) {
 
         Scanner scanner = new Scanner(System.in);
        double salario;
        double totalVendas;
      

        System.out.print("Digite o seu salário fixo: ");
       salario = scanner.nextDouble();
       
        System.out.println("Digite o total de vendas feitas: ");
        totalVendas = scanner.nextDouble();
        
        double comissao = totalVendas*0.4;
        double comissaoFinal = salario + comissao;
        
        System.out.println("O seu salario final é de: " + comissaoFinal);
    }
    
}
