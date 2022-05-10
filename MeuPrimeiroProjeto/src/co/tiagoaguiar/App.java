package co.tiagoaguiar;

public class App {

    // padrao (default)
    static int x;

    // public (visibilidade publica p/ todos os packages)
    public static int y;

    // private (visibilidade privada p/ todos os packages, somente a classe atual pode acessar
    // essa variavel)
    private static int z;

    // Nao sera explicado agora
    protected static int w;

    public static void main(String[] args) {
        // VISIBILIDADE DE ESCOPO
    }

    public static void sum(int a, int b) {
        System.out.println(x);
    }
}
