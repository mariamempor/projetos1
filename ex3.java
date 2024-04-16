package listadeexerciciospsc1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura;
        String sexo;
        double pesoIdeal;

        System.out.println("Qual a sua altura? ");
        altura = scanner.nextDouble();

        System.out.println("Qual o seu sexo? digite M para masculino e F para feminino ");
        sexo = scanner.next();

        if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else {
            System.out.println("Sexo inválido! ");
            return;
        }

        System.out.println("O seu peso ideal é: " + pesoIdeal);
    }
}