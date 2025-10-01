package aula15;

public class ContaCorrente {
    int numeroDaConta;
    String nomeDoTitular;
    double saldo;

  
    public ContaCorrente(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0;
    }


    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente!");
    }

    public void mostrar() {
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("Titular: " + nomeDoTitular);
        System.out.println("Saldo: " + saldo);
       
    }

    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(1234, "Maria");
        c.mostrar();
        c.depositar(500);
        c.sacar(200);
        c.sacar(400); 
        c.mostrar();
    }
}
