package aula10;

import java.util.Scanner;

/*escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";*/

public class Aula10 {

    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
        
        System.out.println("Informe sua altura e peso usando virgula: ");
        var altura = scanner.nextDouble();
        
         System.out.println("Informe sua altura e peso usando virgula: ");
        var peso = scanner.nextDouble();
            
        var IMC = peso/((altura * altura));  
        
       if (IMC <= 18.5) {   
           System.out.println("abaixo do peso");
       }
       else if(IMC <= 24.9) {
           System.out.println("Peso ideal");
       } 
       else if (IMC <= 29.9){       
       System.out.println("Levemente acima do peso");      
       }
       else if (IMC <= 34.9){
           System.out.println("Obesidade Grau I");
       }
        else if (IMC <= 35.0 ){
           System.out.println("Obesidade Grau II (Severa)");   
       }
        else if (IMC <= 40.0 ) {   
           System.out.println("Obesidade III (Mórbida)");
       }
           
         
       
       
    }
    
}
