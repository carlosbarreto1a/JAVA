package aula14;

public class ControleTV {
    public int canal;
    public int volume;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >=0 && canal <= 100 )
        this.canal = canal;
    
    }

    public int getVolume() {
        return volume;
    }
    
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }
    public void reduzirVolume() {
        if (volume > 0) {
            volume --;
        }
    }
}

