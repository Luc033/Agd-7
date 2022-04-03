

package javaapplication20;

import java.util.Scanner;

public class Agd7 {
    public static void main(String[] args) {
   
    double v, d;
    String p;
    Scanner ler = new Scanner (System.in);
    
    System.out.println("=============================================");
    System.out.println("Promoção de aniversário da Padaria de Joaquim");
    System.out.println("=============================================");
    System.out.println("");

    for ( int i = 1; i <= 10;){
    System.out.println("Escreva o nome do produto:");
    p = ler.next();
    System.out.println("");

    System.out.println("Escreva o seu valor:");   
    v = ler.nextDouble();
    System.out.println("");

    d = ((v*50)/100);

    System.out.println("o valor de " + p +" com desconto promocional é de " + d + " reais!");
    System.out.println("   ================================================");


    i++;
    }
    
  }
}














    
  
