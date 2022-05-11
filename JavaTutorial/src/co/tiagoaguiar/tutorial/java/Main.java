package co.tiagoaguiar.tutorial.java;

public class Main {

    public static void main(String[] args) {
        // static

        User tiago = new User("Tiago", "Aguiar");
        User cesar = new User("Cesar", "Aguiar");
        User joao = new User("Joao", "Aguiar");

        User.setCount(2);

        System.out.println(tiago.getCount());
        System.out.println(cesar.getCount());
    }
}
