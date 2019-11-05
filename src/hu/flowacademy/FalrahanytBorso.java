package hu.flowacademy;

public class FalrahanytBorso implements Alkoholos1 {

    public double alkoholTartalom;
    public String iz;

    public FalrahanytBorso(double alkoholTartalom, String iz) {
        this.alkoholTartalom = alkoholTartalom;
        this.iz = iz;
    }

    public String milyenIzu() {
        return this.iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return this.alkoholTartalom;
    }

    @Override
    public String toString() {
        return "Alkoholtartama: " + this.mennyiAlkoholtTartalmaz() + "%, íze: " + this.milyenIzu();
    }
}
