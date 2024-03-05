public class Bankrekening {
    public Bankrekening (double saldo) {
        this.saldo = saldo;
    }
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }
    public void geldStorten(double hoeveelheid){
        this.saldo += hoeveelheid;
    }
    public void geldOpnemen(double hoeveelheid) {
        this.saldo -= hoeveelheid;
    }
}