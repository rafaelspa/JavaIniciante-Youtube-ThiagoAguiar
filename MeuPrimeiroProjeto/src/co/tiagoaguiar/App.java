package co.tiagoaguiar;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Guitar fender = new Guitar();
        fender.chords = 6;
        fender.name = "fender";

        Guitar ibanez = new Guitar();
        ibanez.chords = 6;
        ibanez.name = "Ibanez";
    }
}
