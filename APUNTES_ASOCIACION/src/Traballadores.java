public abstract class Traballadores extends Socio {

    private String dataIngreso;

    public Traballadores(String DNI, String nome, String direccion, String provincia, String dataAlta, double cuotaMensual, String dataIngreso) {
        super(DNI, nome, direccion, provincia, dataAlta, cuotaMensual);
        this.dataIngreso=dataIngreso;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    public void setDataIngreso(String dataIngreso) {
        this.dataIngreso = dataIngreso;
    }



}
