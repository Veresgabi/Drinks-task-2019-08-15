package hu.flowacademy;

public class Gyumolcsle extends Ital {

    public String gyumolcs;
    public String iz;
    public String marka;

    public Gyumolcsle(String gyumolcs, String iz, String marka) {
        this.gyumolcs = gyumolcs;
        this.iz = iz;
        this.marka = marka;
    }

    @Override
    public String mibolKeszult() {
        return this.gyumolcs;
    }

    @Override
    public String milyenIzu() {
        return this.iz;
    }

    public String milyenMarkaju() {
        return this.marka;
    }

    @Override
    public String toString() {
        return super.toString() + ", márkája: " + this.milyenMarkaju();
    }

}
