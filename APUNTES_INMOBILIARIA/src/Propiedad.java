public abstract class Propiedad {
    private String rua;
    private int numero;
    private String localidade;
    private int prezo;

    public Propiedad(String rua, int numero,  String localidade, int prezo) {
        this.rua=rua;
        this.numero=numero;
        this.localidade=localidade;
        this.prezo=prezo;


    }


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public void vender (){
        System.out.println("Propiedad Vendida");
    }
    public void alugar (){
        System.out.println("Propiedad Alugada");
    }

    public abstract void datosPropiedade();

    public abstract int calcularGanancia(int prezo);

}
