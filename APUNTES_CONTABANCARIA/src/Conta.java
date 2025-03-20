public class Conta {

    private String nome;
    private String numeroConta;
    private double tipoInterese;
    private double saldo;


    public Conta(String nome, String numeroConta, double tipoInterese, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.tipoInterese = tipoInterese;
        this.saldo = saldo;
    }

     public Conta() {
        this.nome="";
        this.numeroConta="";
        this.tipoInterese=0;
        this.saldo=0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getTipoInterese() {
        return tipoInterese;
    }

    public void setTipoInterese(double tipoInterese) {
        this.tipoInterese = tipoInterese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double cantidade){
        this.saldo += cantidade;
    }

    public void reintegro (double cantidade){
        this.saldo -= cantidade;
    }

    public void transferencia (String numeroConta, double cantidade){
        this.saldo -= cantidade;
        System.out.println("Se ha transferido "+ cantidade +" a la cuenta "+ numeroConta);
    }
}
