package prog1tratamento;

import java.util.Scanner;

public class Prog1Tratamento {

    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int numero1, numero2;
          while(true){
              try {
              
                  System.out.print("Digite um valor inteiro..:");
                  numero1 = s.nextInt();
                  System.out.print("Digite um valor inteiro..:");
                  numero2 = s.nextInt();
                  System.out.println("\n"+numero1+" + "+numero2+" = "+(numero1+numero2)+"\n\n"); 
              } catch (Exception ex) {
                 // System.err.println("\nERRO - Valor digitado inválido!\n\n"); 
                 System.err.println(ex.getMessage());
                 //ex.printStackTrace();  
                 s.nextLine();
              }
              
          }
    }
    
}
