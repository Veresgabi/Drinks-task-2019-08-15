package hu.flowacademy;

public class Bor extends Ital implements Alkoholos1 {

    public String szolofajta;
    public String iz;
    public double alkoholtartalom;

    public Bor(String szolofajta, String iz, double alkoholtartalom) {
        this.szolofajta = szolofajta;
        this.iz = iz;
        this.alkoholtartalom = alkoholtartalom;
    }

    @Override
    public String mibolKeszult() {
        return this.szolofajta;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholtartalom;
    }

    @Override
    public String toString() {
        return super.toString() + ", alkohol tartama: " + this.mennyiAlkoholtTartalmaz() + "%";
    }
}
