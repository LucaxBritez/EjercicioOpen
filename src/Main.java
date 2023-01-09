import java.io.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        1-Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        2-Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        3-Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        4-Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        5-Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        6-Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        7-Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        8-Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".//
        9-Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.*/



public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Funcion de inversion de orden-----------");
        String str = "Concern Appe";

    // Tenga en cuenta que la string es inmutable en Java.

        str = reverse(str);

        System.out.println("El reverso del string es: " + str);





    //2-Array unidimensional y su recorrido.

        System.out.println("-----------Array unidimensional de String-----------");
        String[] arreglo = {"Huevo", "Jamon", "Jugo", "Queso", "Pan"};
        for (String s : arreglo) {
            System.out.println(s);
        }





    //3-Array bidimensional y su recorrido.

        System.out.println("-----------Array bidimensional de enteros-----------");
        int[][] matriz = {{1, 2, 3},{4, 5, 6}};
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(" | ");
                System.out.print(anInt);
                System.out.print (" | ");
            }
            System.out.println();
        }





    //4A-Vector de tipo entero y eliminacion de su segundo y primer elemento.

        System.out.println("-----------Vector de tipo String-----------");
        Vector <String> vec = new Vector<>(5, 5);
        vec.add("Conejo");
        vec.add("Pato");
        vec.add("Jabali");
        vec.add("Oso");
        vec.add("Armadillo");
        vec.removeElementAt(1);
        vec.removeElementAt(2);

        System.out.println(vec);

    /*4B-
          El problema de añadir 1000 elementos a un vector que posee un tamaño por defecto(10) radica en el
        consumo de memoria que implicara su expansion, ya que esta sera inicialmente del doble de tamaño que posee
        al momento de su desborde y el proceso se repetira hasta alcanzar la cuota de espacio necesaria.
          Teniendo en cuenta que para poder expandirse se realiza una copia de los datos que posee el arreglo inicial
        en el nuevo, el proceso se vuelve muy demandante para la maquina.*/





    //5-Creacion de un ArrayList de tipo string y su copiado a un LinkedList

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Jose");
        lista.add("Alumine");
        lista.add("Luca");

        LinkedList<String> listaEnlazada = new LinkedList<>(lista);

    //Bucle for para imprimir arrayList

        System.out.println("-----------ArrayList elemento por elemento-----------");
        for(int i=0;i <lista.size() ; i++){
            System.out.println("El valor del elemento numero " + i + " del arraylist es " + lista.get(i));
        }

    //Bucle for para imprimir linkedList

        System.out.println("-----------LinkedList elemento por elemento-----------");
        for(int i=0;i <listaEnlazada.size() ; i++){
            System.out.println("El valor del elemento numero " + i + " de la linkedlist es " + listaEnlazada.get(i));
        }





    //6-Creacion de un arraylist, agregado de elementos del 1 al 10 a traves de un bucle for.
        System.out.println("-----------ArrayList rellenada con bucle for cuyos pares son substraidos-----------");
        ArrayList<Integer> enteros = new ArrayList<>(10);

        for (int i = 1; i <= 10; i++) {
            enteros.add(i);
            }
        for(int i = 0; i<enteros.size(); i++){
            if(enteros.get(i) % 2 == 0){
                enteros.remove(i);
            }
        }
        System.out.println(enteros);

    //7-Se aplica el metodo DividePorCero y se captura su excepcion.
        System.out.println("-----------Funcion DividePorCero-----------");
    try {
        DividePorCero(1,1);
        System.out.println("Demo de codigo.");
    } catch (ArithmeticException e){
        System.out.println("Esto no puede hacerse.");
    }


    //8-


    }







//1-Funcion que devuelve los caracteres de un string con el orden inverso.
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
//7-Aplicacion de throws en un metodo que divide entre 0.
    public static void DividePorCero(int a , int b)throws ArithmeticException{
        int resultado = a / b;
        System.out.println("El resultado de la operacion es: " + resultado);
    }


//8-asdasdasdasd

}