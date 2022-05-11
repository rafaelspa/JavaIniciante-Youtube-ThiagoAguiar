package co.tiagoaguiar;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        User userA = new User();
        userA.setFirstName("Tiago");


        User userB = new User();
        userB.setFirstName("Apple Incorporation");
        System.out.println(userB.getFirstName());
    }
}
