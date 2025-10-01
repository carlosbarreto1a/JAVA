package aula8;

import java.util.Scanner;


public class Aula8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
    
        System.out.println("Infome seu nome:");
        var pessoa1 = scanner.nextLine();      
        var pessoa2 = scanner.nextLine();
       System.out.println("Infome sua idade:");
        var idade1 = scanner.nextInt();
        var idade2 = scanner.nextInt();     
      
                
        var diferenca = Math.abs (idade1 - idade2);
        System.out.println("Diferenca de idade de:" + diferenca);        
         
                
                
                
                
                
                
                
                
                
                
                
                
                
                
    }
    
}
