
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[]num = new int [10];
        int soma = 0;
        int i;
        
        System.out.println("Digite 10 numeros");
        for(i = 0; i < 10; i++){
            num[i] = scanner.nextInt();
            soma += num[i];
        }
        double media = (double) soma/ 10;
        double acimaDaMedia = 0;
        double abaixoDaMedia = 0;
        
        for(i = 0; i < 10; i++){
            if (num[i] > media){
                acimaDaMedia++;
            }else if (num[i] < media){
                abaixoDaMedia++;
            }
            
        }
        System.out.println("A media dos numeros é: " + media);
        System.out.println("A quantidade dde numeros abaixo da média é : " + abaixoDaMedia);
        System.out.println("A quantidade de numeros acim da media é: " + acimaDaMedia);
    }
    
}
