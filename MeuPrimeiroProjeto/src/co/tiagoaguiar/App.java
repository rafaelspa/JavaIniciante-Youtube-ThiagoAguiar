package co.tiagoaguiar;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String x = "   Ola mundo, esse é o novo mundo   ";
        System.out.println(x.length());
        System.out.println(x + " concatenada");
        System.out.println(x.contains("novo"));
        System.out.println(x.indexOf("mundo"));
        System.out.println(x.lastIndexOf("mundo"));
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.trim());
        System.out.println(x.substring(9));
        System.out.println(x.equals("ola"));
    }
}
