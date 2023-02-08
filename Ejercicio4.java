import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la distancia recorrida (Km): ");
        double distancia = teclado.nextDouble();
        System.out.println("");

        System.out.println("Introduzca el tiempo empleado (min): ");
        double tiempo = teclado.nextDouble();
        System.out.println("");

        tiempo = tiempo / 60;
        double calculo = distancia / tiempo;

        System.out.println("Se ha desplazado a una velocidad de: " + calculo + " Km/h");


    }
    
}
