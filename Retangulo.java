package aula13;

public class Retangulo {
    private int altura;
    private int base;

    public int getaltura() {
       return altura;
    }

    public void setAltura(int altura) {
       this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
   public int CalcularArea() {
    return base * altura;
   }
    
   public int CalcularPerimetro(){
    return 2 * (base + altura);
    
}
}