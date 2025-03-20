public class Voluntarios extends Traballadores implements gastosIngresos{

    private int edade;
    private String profesion;
    private int horasAdicadas;
    private double ingresos;

    public Voluntarios(String DNI, String nome, String direccion, String provincia, String dataAlta, double cuotaMensual, String dataIngreso, int edade, String profesion, int horasAdicadas, double ingresos) {
        super(DNI, nome, direccion, provincia, dataAlta, cuotaMensual, dataIngreso);
        this.setCuotaMensual(3);
        this.edade = edade;
        this.profesion = profesion;
        this.horasAdicadas = horasAdicadas;
        this.ingresos=ingresos;
    }


    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getHorasAdicadas() {
        return horasAdicadas;
    }

    public void setHorasAdicadas(int horasAdicadas) {
        this.horasAdicadas = horasAdicadas;
    }

    @Override
    public String aCadea() {
        return "DNI: " + getDNI() + "\n" +
                "Nome: " + getNome() + "\n" +
                "Dirección: " + getDireccion() + "\n" +
                "Provincia: " + getProvincia() + "\n" +
                "Data Alta: " + getDataAlta() + "\n" +
                "Cuota Mensual: " + getCuotaMensual() + "\n" +
                "Data Ingreso: " + getDataIngreso() + "\n" +
                "Edade: " + getEdade() + "\n" +
                "Profesión: " + getProfesion() + "\n" +
                "Horas Adicadas: " + getHorasAdicadas();
    }

    @Override
    public double calcularGastosIngresos() {
        return this.ingresos - getCuotaMensual();
    }
}
