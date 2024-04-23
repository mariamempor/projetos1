package brinquedosj;

import java.util.Scanner;

public class BrinquedoSJ {

  
    public static void main(String[] args) {
 //ativar
  //  Robo robo = new Robo();
   //     System.out.println(robo.getNome() + "-" + robo.getBateria() + "-" + robo.getDat_fab());
   calculadora Calc = new calculadora (new Robo());
   Scanner scanner = new Scanner(System.in);
   int opcao;
   float num1,num2;
   
   System.out.println("Olá, sou o" + Calc.getRobo().getNome());
        System.out.println("Estou atendendo com " + Calc.getRobo().getBateria()+ "de bateria");
        System.out.println("\n\n**Menu**");
        System.out.println("1- somar");
        System.out.println("5- fim");
        System.out.println("digite uma opção");
        opcao = scanner.nextInt();
        
        if (opcao ==1 ){
            System.out.println("digite um numero"); num1 = scanner.nextFloat();
            System.out.println("digite outro numero"); num2 = scanner.nextFloat();
            System.out.println("a soma será: " + Calc.Somar(num1, num2)); 
            Calc.getRobo().setBateria(Calc.getRobo().getBateria()-1);
            System.out.println("Estou atendendo com " + Calc.getRobo().getBateria() + "de bateria");
        }
        
    }
    
}
