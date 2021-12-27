package Ejercicio123;

public class Ejercicio3 {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "Pepe", "Javi", "Lucia", "Ana", "Julia"};

        //for (int i = 0; i < nombres.length; i++) {
        // System.out.print(nombres[i]);
        //}
        for(String nombre : nombres){
            System.out.print(nombre);
        }
    }
}