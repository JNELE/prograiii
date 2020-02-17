package introduccion;

import java.util.Arrays;
import java.util.Scanner;
public class Persona
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        //Para leer cadenas
        System.out.println("Ingrese nombre");
        String miNombre = leer.nextLine();
        System.out.println("Ingrese apellido");
        String miApellido = leer.nextLine();

        System.out.printf("Su nombre completo es: %s %s",miNombre,miApellido);System.out.println();

        System.out.println("Ingrese su edad");
        int miEdad = leer.nextInt();
        System.out.printf("Su edad es: %d",miEdad);
        //sumar las primeros 5 edades
        int sumaEdades=0;
        double promedio=0;
        int cont=0;
        System.out.println("Ingrese su edad");
        while (cont <5)
        {

            int miEdad2 = leer.nextInt();
            sumaEdades= sumaEdades + miEdad2;
            System.out.println("Ingrese su edad");
            cont ++;
        }

        System.out.println("Suma total de edades es: " + sumaEdades);
        System.out.println("El promedio es: " +(sumaEdades/cont) );




    }
}
