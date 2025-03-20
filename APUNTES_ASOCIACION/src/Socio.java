public abstract class Socio {

    private String DNI;
    private String nome;
    private String direccion;
    private String provincia;
    private String dataAlta;
    private double cuotaMensual;



    public Socio(String DNI, String nome, String direccion, String provincia, String dataAlta, double cuotaMensual) {
        this.DNI = DNI;
        this.nome = nome;
        this.direccion = direccion;
        this.provincia = provincia;
        this.dataAlta = dataAlta;
        this.cuotaMensual = cuotaMensual;
    }



    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public abstract String aCadea();

}
