public class vivenda extends Propiedad {

    private char portal;
    private int piso;
    private int numHabitaciones;
    private boolean plazaGaraje;
    private boolean trastero;
    private String propiedad;

    public vivenda(String rua, int numero, String localidade, int prezo, char portal, int numHabitaciones, int piso, boolean plazaGaraje, boolean trastero, String propiedad) {
        super(rua, numero, localidade, prezo);
        this.portal = portal;
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
        this.plazaGaraje = plazaGaraje;
        this.trastero = trastero;
        this.propiedad = propiedad;
    }

    public boolean isTrastero() {
        return trastero;
    }

    public void setTrastero(boolean trastero) {
        this.trastero = trastero;
    }

    public char getPortal() {
        return portal;
    }

    public void setPortal(char portal) {
        this.portal = portal;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public boolean isPlazaGaraje() {
        return plazaGaraje;
    }

    public void setPlazaGaraje(boolean plazaGaraje) {
        this.plazaGaraje = plazaGaraje;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public void datosPropiedade() { //COMO STRING Y UN RETURN Y CONCATENAR CADENA: String cadena =("Rúa: " + getRua());  , cadena +=

        System.out.println("Propiedades de la vivienda:");
        System.out.println("Rúa: " + getRua());
        System.out.println("Número: " + getNumero());
        System.out.println("Localidade: " + getLocalidade());
        System.out.println("Prezo: " + getPrezo() + "€");
        System.out.println("Portal: " + portal);
        System.out.println("Piso: " + piso);
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Plaza de garaje: " + (plazaGaraje ? "Sí" : "No"));
        System.out.println("Trastero: " + (trastero ? "Sí" : "No"));
        System.out.println("Propiedad: " + propiedad);
    }

    @Override
    public int calcularGanancia(int prezo){
        return (int) (this.getPrezo()*0.02);
    }



}
