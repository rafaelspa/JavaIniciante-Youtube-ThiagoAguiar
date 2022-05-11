package co.tiagoaguiar.tutorial.java;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 3. comparando arrays
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{1, 2, 3};
        int[] numbersC = numbersA;

        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals(numbersB));
        System.out.println(Arrays.equals(numbersA, numbersB));
        System.out.println(numbersA + " " + numbersB);

        System.out.println(numbersA == numbersC);
        System.out.println(numbersA.equals(numbersC));
        System.out.println(Arrays.equals(numbersA, numbersC));
        System.out.println(numbersA + " " + numbersC);

    }
}
