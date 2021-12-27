package Ejercicio789;

public class EjercicioReverse {

    public static void main(String[] args) {

        String mensaje = "Hola mundo";

        for(int i = mensaje.length() - 1; i >= 0; i--){
            System.out.println(mensaje.charAt(i));
        }

    }
}
