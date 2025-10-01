package aula7;
import java.util.Scanner;

public class Aula7 {
 
    public static void main(String[] args) {
      var scanner = new Scanner(System.in);
      
        System.out.println("Infome o tamanho da base do retangulo: ");
        var base = Integer.parseInt(scanner.next());
        
        System.out.println("Infome o tamanho da altura do retangulo: ");
        var altura = Integer.parseInt(scanner.next());
        
        
        var area = base * altura;     
        
        System.out.println("aqui esta area: " + area);
        
    }
    
}
