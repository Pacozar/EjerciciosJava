package Ejercicio123;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca precio producto");
        double precio = scanner.nextDouble();
        System.out.println("introduzca importe de IVA");
        double iva = scanner.nextDouble();
        double total = resultado(precio, iva);
        System.out.println("El precio con IVA es " + total);
    }

    static double resultado(double precio, double iva) {
        return precio * iva / 100 + precio;
    }
}