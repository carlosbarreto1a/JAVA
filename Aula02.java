package aula02;
import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos tienes vc");
        var age = scanner.nextInt();
        System.out.println("eres emancipado ?");
        var isEmancipated = scanner.nextBoolean();
        var canNotDrive = age > 18 || isEmancipated && age >= 16;
        System.out.printf("Voce pode dirigir? (%s) \n", canNotDrive);
        
                
        
        
    }
    
}
