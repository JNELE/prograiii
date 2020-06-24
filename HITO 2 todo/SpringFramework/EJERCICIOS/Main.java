package EJERCICIOS;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Ejercicios ejercicios = new Ejercicios();
        ejercicios.menu();
        System.out.println("Escribe una de las opciones");
        opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    ejercicios.SerieFibonacci(10);
                    ejercicios.imprimirSerie();

                    break;
                case 2:

                    ejercicios.leerVector();
                    ejercicios.mostarVector();

                    System.out.println();

                    System.out.println("Por metodo de la burbuja");
                    ejercicios.burbuja();
                    ejercicios.mostarVector();

                    System.out.println();

                    System.out.println("Por metodo de seleccion");
                    ejercicios.seleccion();
                    ejercicios.mostarVector();

                    break;
                case 3:
                    ejercicios.EncontrarCadena();

                    break;
                case 4:
                    ejercicios.ParesenArray();
                    break;

                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }



}
