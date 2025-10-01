package aula01;

import java.util.Scanner;

public class Aula01 {

    private static final String WELCOME_MESSAGE = "Ola, informe o seu nome:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        String name = sc.next();

        System.out.println("Informe sua idade:");
        int age = sc.nextInt();
        
        if (age <= 17) {
            System.out.println("Usuario de menor, favor indicar uma pessoa de maior ! ");
} 
        else{
        System.out.printf("Ola %s, sua idade eh %d anos%n", name, age);
        }
        
       if ( age >= 100){
           System.out.println("Vc eh um idoso");
    }
}
}
