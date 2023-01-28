package Clases;

public class Division {
    //7-Aplicacion de throws en un metodo que divide entre 0.
    public static void DividePorCero(int a , int b)throws ArithmeticException{
        int resultado = a / b;
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
