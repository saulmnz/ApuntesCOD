public class locaisComerciais extends Propiedad{

    private int portal;
    private boolean acondicionado;
    private boolean fachadaRua;
    private boolean entradaMercaderia;
    private int m2;

    public locaisComerciais(String rua, int numero, String localidade, int prezo, int portal, boolean acondicionado, boolean fachadaRua, boolean entradaMercaderia, String observaciones, int m2) {
        super(rua, numero, localidade, prezo);
        this.portal = portal;
        this.acondicionado = acondicionado;
        this.fachadaRua = fachadaRua;
        this.entradaMercaderia = entradaMercaderia;
        this.observaciones = observaciones;
        this.m2 = m2;
    }

    private String observaciones;



    public boolean isAcondicionado() {
        return acondicionado;
    }

    public void setAcondicionado(boolean acondicionado) {
        this.acondicionado = acondicionado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public boolean isEntradaMercaderia() {
        return entradaMercaderia;
    }

    public void setEntradaMercaderia(boolean entradaMercaderia) {
        this.entradaMercaderia = entradaMercaderia;
    }

    public boolean isFachadaRua() {
        return fachadaRua;
    }

    public void setFachadaRua(boolean fachadaRua) {
        this.fachadaRua = fachadaRua;
    }

    public int getPortal() {
        return portal;
    }

    public void setPortal(int portal) {
        this.portal = portal;
    }

    @Override
    public void datosPropiedade() {
        System.out.println("Propiedades del local comercial:");
        System.out.println("Rúa: " + getRua());
        System.out.println("Número: " + getNumero());
        System.out.println("Localidade: " + getLocalidade());
        System.out.println("Prezo: " + getPrezo() + "€");
        System.out.println("Portal: " + portal);
        System.out.println("Acondicionado: " + (acondicionado ? "Sí" : "No"));
        System.out.println("Fachada a rúa: " + (fachadaRua ? "Sí" : "No"));
        System.out.println("Entrada de mercadería: " + (entradaMercaderia ? "Sí" : "No"));
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Metros cuadrados: " + m2 + " m²");
    }
    @Override
    public int calcularGanancia(int prezo){
        return (int) (this.getPrezo()*0.02);
    }
}
