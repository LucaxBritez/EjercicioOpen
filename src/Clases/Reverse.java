package Clases;

public class Reverse {
    //1-Funcion que devuelve los caracteres de un string con el orden inverso.
    public static String invertir(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
