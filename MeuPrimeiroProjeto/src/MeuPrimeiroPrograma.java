public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        calc(10, 5); // argumentos
    }

    static void calc(int x, int y) {
        // static void > declaracao padrao (falaremos depois sobre isso, mas precisa!)
        // sum > NOME DA FUNCAO, GERALMENTE USAMOS VERBOS PARA DEFINIR O QUE A FUNÇÃO FAZ
        // () > PARENTESES USAMOS PARA DEFINIR O QUE CHEGARÁ NAQUELA FUNÇÃO (parametros)
        // (tipo nomeDaVariavel)
        // {} > bloco de código que será executado


        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);
    }
}
