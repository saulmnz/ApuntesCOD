public class prazasDeGaraje extends Propiedad{
  private int ancho;
  private int longo;
  private int numeroDePlaza;
  private boolean trasteiro;

    public prazasDeGaraje(String rua, int numero, String localidade, int prezo, int longo, int ancho, int numeroDePlaza, boolean trasteiro) {
        super(rua, numero, localidade, prezo);
        this.ancho=ancho;
        this.longo=longo;
        this.numeroDePlaza=numeroDePlaza;
        this.trasteiro=trasteiro;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLongo() {
        return longo;
    }

    public void setLongo(int longo) {
        this.longo = longo;
    }

    public int getNumeroDePlaza() {
        return numeroDePlaza;
    }

    public void setNumeroDePlaza(int numeroDePlaza) {
        this.numeroDePlaza = numeroDePlaza;
    }

    public boolean isTrasteiro() {
        return trasteiro;
    }

    public void setTrasteiro(boolean trasteiro) {
        this.trasteiro = trasteiro;
    }

    @Override
    public void datosPropiedade(){
            System.out.println("Propiedades de la plaza de garaje:");
            System.out.println("Rúa: " + getRua());
            System.out.println("Número: " + getNumero());
            System.out.println("Localidade: " + getLocalidade());
            System.out.println("Prezo: " + getPrezo() + "€");
            System.out.println("Longo: " + longo + " metros");
            System.out.println("Ancho: " + ancho + " metros");
            System.out.println("Número de plaza: " + numeroDePlaza);
            System.out.println("Trasteiro: " + (trasteiro ? "Sí" : "No"));

    }
    @Override
    public int calcularGanancia(int prezo){
        return (int) (this.getPrezo()*0.03);
    }



    }



