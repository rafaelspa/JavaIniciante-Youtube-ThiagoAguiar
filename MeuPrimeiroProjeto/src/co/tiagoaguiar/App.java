package co.tiagoaguiar;

public class App {

    public static void main(String[] args) {
        // tipos primitivos

        boolean isLogged = true;
        byte b = 'a';
        char c = 'c';
        String character = "c";
        short c = -129; // = int (só com menos espaços)
        int i = 12341243; // grande
        long l = 13412351958L; // = int (só com mais espaços)
        float f = 19.19f; // 32bit (menor do que double)
        double d = 19.19; // 64bit

        // nao primitivo

        String character = "c";
        String character2 = new String("str");
    }
}
