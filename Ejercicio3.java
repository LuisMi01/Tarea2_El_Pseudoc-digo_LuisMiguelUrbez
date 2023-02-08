import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor 1: ");
        double valor1 = teclado.nextDouble();
        System.out.println("");
        System.out.println("Introduzca el valor 2: ");
        double valor2 = teclado.nextDouble();
        System.out.println("");

        valor1 = valor2;
        valor2 = valor1;

        System.out.println("valor1 = " + valor1 + " valor2 = " + valor2);
    }
}
