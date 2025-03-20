public class Asalariados extends Traballadores implements gastosIngresos{

    private double soldo;
    private double porcentajeSS;
    private double descuentoIRPF;


    public Asalariados(String DNI, String nome, String direccion, String provincia, String dataAlta, double cuotaMensual, String dataIngreso, double soldo, double porcentajeSS, double descuentoIRPF) {
        super(DNI, nome, direccion, provincia, dataAlta, cuotaMensual, dataIngreso);
        this.soldo = soldo;
        this.porcentajeSS = 0.15;
        this.descuentoIRPF = descuentoIRPF;
    }

    public double getDescuentoIRPF() {
        return descuentoIRPF;
    }

    public void setDescuentoIRPF(double descuentoIRPF) {
        this.descuentoIRPF = descuentoIRPF;
    }

    public double getPorcentajeSS() {
        return porcentajeSS;
    }

    public void setPorcentajeSS(double porcentajeSS) {
        this.porcentajeSS = porcentajeSS;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
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
                "Soldo: " + getSoldo() + "\n" +
                "Porcentaxe SS: " + getPorcentajeSS() + "%\n" +
                "Desconto IRPF: " + getDescuentoIRPF() + "%";
    }

    @Override
    public double calcularGastosIngresos() {
        return 0 - (this.soldo + this.soldo*porcentajeSS) ;
    }



}
