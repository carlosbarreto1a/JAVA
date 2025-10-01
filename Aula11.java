package aula11;

import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Caneta c1 = new Caneta();
        System.out.println("A cor da caneta eh: " + c1.getCor());
        System.out.print("Informe a cor da caneta: ");
        String cor = entrada.nextLine();

        c1.setCor(cor);

        System.out.println("A cor da caneta eh: " + c1.getCor());
    }
}
