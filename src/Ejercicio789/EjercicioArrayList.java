package Ejercicio789;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioArrayList {

    public static void main(String[] args) {
        ArrayList<String> capitales = new ArrayList<String>();
        capitales.add("Sevilla");
        capitales.add("Malaga");
        capitales.add("Cadiz");
        capitales.add("Granada");
        for(Object arrayCapitales : capitales.toArray()){
            System.out.println("List " + arrayCapitales.toString());
        }
        LinkedList<String> capitalesEnlazadas = new LinkedList<String>(capitales);
        for(Object linkedCapitales : capitalesEnlazadas.toArray()){
            System.out.println("linked " + linkedCapitales.toString());
        }
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            if(i % 2 == 0) numeros.add(i+1);
            System.out.println(numeros);
        }

    }
}