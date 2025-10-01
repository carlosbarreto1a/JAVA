package aula6;
import java.util.Scanner;

public class Aula6 {
   
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informe o lado do quadrado: "); 
         var quad = Integer.parseInt(scanner.next());
        
         var area = quad * quad;
         
        System.out.println("lado x lado = : " + area);
            
    }
    
}
