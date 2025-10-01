package aula4;

import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        var value1 = scanner.nextInt();

        System.out.println("Informe outro numero, pls my friend: ");
        var value2 = scanner.nextInt();

        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);
    }
}
