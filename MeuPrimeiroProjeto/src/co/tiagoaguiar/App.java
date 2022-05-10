package co.tiagoaguiar;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String password = "123456"; // 0010
        System.out.println("Digite a sua senha: ");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine(); // 0100

        // == nao compara conteudo, ele compara a referencia dos objetos
//        System.out.println(password == pass);
        System.out.println(password.equals(pass));

        String x = "123456"; // 00010
        String y = "123456"; // 00010
        System.out.println(x == y);
    }
}
