public class coche {



    private int velocidade;
    public coche(){
        velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }

    public void frenar (int menos){
        velocidade = velocidade-menos;
    }

}

