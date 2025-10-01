package aula9;

import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
             
    System.out.println("Digite um numeo para criarnos uma tabuada de 1 a 10:");
    var num1 = scanner.nextInt();
        
     System.out.println("\nTabuada do " + num1 + ":\n");

        for (var tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println(num1 + " x " + tabuada + " = " + (num1 * tabuada));
        }       
    }
    
}
