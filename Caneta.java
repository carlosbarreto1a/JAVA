package aula16;

public class Caneta {
  public  String modelo;
  public  String cor;
  public  float ponta;
  public  int carga;
  public  boolean tampada;
    
    void status() {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Uma caneta: " +this.cor);
        System.out.println("Ponta da caneta: " +this.ponta);
        System.out.println("Carga da caneta eh: " + this.carga);
        System.out.println("esta tampada a caneta: " + this.tampada);        
            
    }
     
  void rabiscar(){  
      if(this.tampada == true){
          System.out.println("Erro! nao posso rabiscar");
      }else{ 
          System.out.println("Estou rabiscando");}
  } 
  
  void tampar() {
     this.tampada = true;
      
  }
    
  void destampar() {
      this.tampada = false;
  }
    
}
