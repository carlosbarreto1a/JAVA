package aula19;
public class ContaBanco {
    // ATRIBUTOS   
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos          
   public void abrirConta(String t) {  
       this.setTipo(t);
       this.setStatus(true);
      if ( t == "CC") {
          this.setSaldo(50);
      } else if ( t == "CP") {
          this.setSaldo(150);
      }
          System.out.println("Conta aberta com sucesso! ");
   }
   
   public void fecharConta() {
        if (getSaldo() > 0){
            System.out.println("Conta não pode ser encerrada, ainda possui dinheiro!");
        } else if (this.getSaldo() <0) {   
            System.out.println("Conta não pode ser encerrada, voce possui débitos");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");     
   }
     
    public void depositar (float v) {
       if ( this.getStatus()) {
           //this.saldo = this.saldo + v;
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Depósito realizado na conta de " + this.getDono());
   }     else { 
           System.out.println("Impossivel depositar em uma conta fechada !");
       
  }   
    
   public void sacar(float v) {
       if( this.getSaldo()){
           if (this.getSaldo() >= v) {
               this.setSaldo((this.getSaldo()));
       
   }
   
   public void pagarMensal() {
       
   }
   
   //Métodos especiais
   public ContaBanco() {
    this.saldo=0;   
    this.status=false;
   }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
   
    
}
