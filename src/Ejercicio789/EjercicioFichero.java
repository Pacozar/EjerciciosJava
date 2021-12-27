package Ejercicio789;

import java.io.*;

public class EjercicioFichero {
    public static void ficheros (String fileIn, String fileOut ){

            try {
                InputStream ficheroIn = new FileInputStream(fileIn);
                byte[] datos = ficheroIn.readAllBytes();
                PrintStream ficheroOut = new PrintStream(fileOut);
                ficheroOut.write(datos);

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

