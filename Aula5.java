
package aula5;

import java.util.Scanner;


public class Aula5 {
     public static void main(String[] args) {
       var scanner = new Scanner(System.in);
        System.out.println("Qual a sua nome ?: ");
        var name = scanner.next();
        System.out.println("Qual a sua data de nascimento ?: ");
        var data = scanner.next();
         System.out.println("Ola seu nome eh: " + name + "\nsua data de nascimneto eh: " + data);
        
        
    }
    
}
