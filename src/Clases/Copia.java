package Clases;

import java.io.*;

public class Copia {

    //8-Crear un metodo que reciba 2 parametros
    public static void CopiarFichero(String fileIn, String fileOut){
        try {
            InputStream direccion1 = new FileInputStream(fileIn);

            try {
                byte [] datos = direccion1.readAllBytes();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                System.out.println("-----------Ejercicio 8 se ejecuto sin problemas(Clases.Copia de ficheros)-----------");

            } catch (IOException e) {
                System.out.println("Hay un problema en el Array datos o en el PrintStream");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tenes un problema con el inputStream");

        }
    }
}
