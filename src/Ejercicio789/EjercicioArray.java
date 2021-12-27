package Ejercicio789;

public class EjercicioArray {

    public static void main(String[] args) {
        String arrayUni[] = {"paco", "Pepe", "Pablo", "Polo", "Publio"};
        for (String nombre : arrayUni) {
            System.out.println(nombre);
        }

        int arrayBidi[][] = {
                {10, 20, 30, 40},
                {100, 200, 300, 400}
        };
        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[1].length; j++) { // para recorrerlo ponemos arrayBidi[i]
                System.out.println("Estoy en i = " + i + ", j = " + j);
                //para que nos muestre el contenido
                System.out.println(arrayBidi[i][j]);
            }
        }
    }
}