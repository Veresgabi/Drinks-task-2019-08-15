package hu.flowacademy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Gezemice {

    public static List<Object> drinks;
    // public static Ital[] array = new Ital[drinks.size()];

    public static void beolvas(String ital) {
        try {
            drinks = Files.lines(Paths.get(ital)).map(s -> {
                String[] arr = s.split("[;%]");
                switch (arr[0]) {
                    case "bor": return new Bor(arr[1], arr[2], Double.parseDouble(arr[3]));     // az első elem nevének megfelelő objektum létrehozása
                    case "gyumolcsle": return new Gyumolcsle(arr[1], arr[2], arr[3]);           // és eltárolása a "drinks" nevű listában
                    case "borso": return new FalrahanytBorso(Double.parseDouble(arr[1]), arr[3]); //arr[3]-at kell megadni, mert a ; és a % jel közötti
                    default: throw new Error("A fájl érvénytelen adatot tartalmaz!");              // rész lenne az arr[2]
                }
            }).collect(Collectors.toList());
        } catch (IOException e) {               // FileNotFoundException-t nem lehet bele tenni, mert az IOException már lekezeli!!
            e.printStackTrace();
        }
    }

    public static Object[] pushIntoArray() {        // A "drinks" lista objektumait áthelyezem egy tömbbe.
        Object[] arr = new Object[drinks.size()];
        for (int i = 0; i < drinks.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = drinks.remove(i);
            }
        }
        return arr;
    }

    public static void printArr(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
    }

    public static void main(String[] args) {

        beolvas("Drinks.csv");
        Object[] array = pushIntoArray();
        printArr(array);

    }

}
