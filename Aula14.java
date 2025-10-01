package aula14;

import java.util.Scanner;

public class Aula14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       ControleTV controle = new ControleTV();
       
       controle.setCanal(96);
       controle.aumentarVolume();
       controle.aumentarVolume();
       
        System.out.println("Canal atual: " + controle.getCanal());
        System.out.println("Volume atual: " + controle.getVolume());
 
        System.out.println("Informe o seu canal: ");
         controle.setCanal(entrada.nextInt());

        System.out.println("Canal atual: " + controle.getCanal());
        System.out.println("Volume atual: " + controle.getVolume());  
        
    }
    
}
