package hu.flowacademy;

public abstract class Ital {

    public Ital() {
    }

    public abstract String mibolKeszult();

    public abstract String milyenIzu();

    @Override
    public String toString() {
        return "Készült: " + mibolKeszult() + "ból, íze: " + milyenIzu();
    }

}
