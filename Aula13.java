package aula13;

import java.util.Scanner;

public class Aula13 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Retangulo ret = new Retangulo();
        
        System.out.println("Informe a base do retangulo: ");
          int base = entrada.nextInt();
          ret.setBase(base);
     
          
          System.out.println("Informe a altura do retangulo: ");
          int altura = entrada.nextInt();
          ret.setAltura(altura);
        
          
          System.out.println(" O perimetro do retangulo eh : " + ret.CalcularPerimetro());
              
    }
    
}