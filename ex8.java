
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      
      int idade;
      String categoria;
      
        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();
        
        if (idade >= 0 && idade <= 10) {
            categoria = "Infantil";
        } else if (idade>= 11 && idade<= 14){
            categoria = "Junior";
        } else if (idade>= 15 && idade<= 20){
            categoria = "Adolescente";
        } else if (idade >= 21 && idade <= 35) {
            categoria = "Jovem";
        }else{
            categoria = "Master";
        }
        System.out.println("O nadador é da categoria: " + categoria);
      
    }
    
}
