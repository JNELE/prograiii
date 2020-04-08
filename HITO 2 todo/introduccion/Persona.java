package introduccion;

import java.util.Arrays;
import java.util.Scanner;
public class Persona
{
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
//        //Para leer cadenas
//        System.out.println("Ingrese nombre");
//        String miNombre = leer.nextLine();
//        System.out.println("Ingrese apellido");
//        String miApellido = leer.nextLine();
//
//        System.out.printf("Su nombre completo es: %s %s",miNombre,miApellido);System.out.println();
//
//        System.out.println("Ingrese su edad");
//        int miEdad = leer.nextInt();
//        System.out.printf("Su edad es: %d",miEdad);
//        //sumar las primeros 5 edades
//        int sumaEdades=0;
//        double promedio=0;
//        int cont=0;
//        System.out.println("Ingrese su edad");
//        while (cont <5)
//        {
//
//            int miEdad2 = leer.nextInt();
//            sumaEdades= sumaEdades + miEdad2;
//            System.out.println("Ingrese su edad");
//            cont ++;
//        }
//
//        System.out.println("Suma total de edades es: " + sumaEdades);
//        System.out.println("El promedio es: " +(sumaEdades/cont) );
//
//
//            int numero1=21;
//
//            if(numero1 % 2 ==0)
//            {
//                System.out.printf("el numero %d es par",numero1);
//            }
//            else
//            {
//                System.out.printf("el numero %d es impar",numero1);
//            }
//            System.out.println();
//
//            String name = "prograiii";
//            if(name.equals("prograv"))
//            {
//                System.out.printf("la cadena %s es igual",name);
//            }
//            else
//            {
//                System.out.printf("la cadena %s es distinto",name);
//            }
//
//            System.out.println();
//
//            for(int i=0;i<=10;i++)
//            {
//                System.out.println(i);
//            }

            System.out.println();
            System.out.println("ingrese su credit_number");

            while(leer.hasNextInt())
            {
                int credit_number = leer.nextInt();

                if (credit_number > 50000)
                {
                    System.out.println("el numero es platinum");
                }
                else if (credit_number >= 10000 && credit_number <= 50000)
                {
                    System.out.println("el numero es gold");
                }
                else if (credit_number < 10000)
                {
                    System.out.println("el numero es silver");
                }

            }



    }
}
