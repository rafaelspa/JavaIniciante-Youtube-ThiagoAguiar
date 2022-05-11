package co.tiagoaguiar;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Tiago", "Aguiar"),
                new User(),
                new User("Flávia", "Silva")
        };
        // |x|x|x|x|

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
}
}