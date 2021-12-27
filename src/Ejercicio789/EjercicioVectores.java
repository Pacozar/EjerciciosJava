package Ejercicio789;

import java.util.Vector;

public class EjercicioVectores {

    public static void main(String[] args) {

        Vector<Integer> vectorInt = new Vector<>();
        vectorInt.add(1);
        vectorInt.add(2);
        vectorInt.add(3);
        vectorInt.add(4);
        vectorInt.add(5);
        System.out.println(vectorInt);

        vectorInt.remove(1);//si no lo pongo asi me borra el 2º y 4º elemento
        vectorInt.remove(1);
        System.out.println(vectorInt);

        //Cuando la capacidad se llena tendria que aumentar 100 veces el tamaño y crear arrays nuevas y copiando todos
        // los elementos por lo cual seria muy costoso computacionalmente
    }
}