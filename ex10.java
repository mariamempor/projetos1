
package listadeexerciciospsc1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     int canal4 = 0;
     int canal5 = 0, canal9 = 0;
     int voto;
     
        System.out.println("Digite o numero do canal(4,5 ou 9) ou digite 0  para encerrar");
        
        while (true) {
            voto = scanner.nextInt();

            if (voto == 0) {
                break;
            } else if (voto == 4) {
                canal4++;
            } else if (voto == 5) {
                canal5++;
            } else if (voto == 9) {
                canal9++;
            } else {
                System.out.println("Canal inválid. Digite 4, 5, 9 ou 0 para terminar.");
            }
        }
         System.out.println("Resultados da pesquisa (em ordem decrescente):");
        if (canal4 >= canal5 && canal4 >= canal9) {
            System.out.println("Canal 4: " + canal4 + " votos");
            if (canal5 >= canal9) {
                System.out.println("Canal 5: " + canal5 + " votos");
                System.out.println("Canal 9: " + canal9 + " votos");
            } else {
                System.out.println("Canal 9: " + canal9 + " votos");
                System.out.println("Canal 5: " + canal5 + " votos");
            }
        } else if (canal5 >= canal4 && canal5 >= canal9) {
            System.out.println("Canal 5: " + canal5 + " votos");
            if (canal4 >= canal9) {
                System.out.println("Canal 4: " + canal4 + " votos");
                System.out.println("Canal 9: " + canal9 + " votos");
            } else {
                System.out.println("Canal 9: " + canal9 + " votos");
                System.out.println("Canal 4: " + canal4 + " votos");
            }
        } else {
            System.out.println("Canal 9: " + canal9 + " votos");
            if (canal4 >= canal5) {
                System.out.println("Canal 4: " + canal4 + " votos");
                System.out.println("Canal 5: " + canal5 + " votos");
            } else {
                System.out.println("Canal 5: " + canal5 + " votos");
                System.out.println("Canal 4: " + canal4 + " votos");
            }
        }
    }
}
