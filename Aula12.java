package aula12;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Aula12 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        
        Bola bo = new Bola();
        
        System.out.println("Informe a cor da bola: ");
        String cor = entrada.nextLine();
        
        bo.setCor(cor);
        System.out.println("A cor da sua bola eh:" + bo.getCor());
    }
    
}
