package empresa;

import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero de Empleados");
        int n = leer.nextInt();
        Empleado[] empleadosRRHH = new Empleado[n];
        Empleado[] empleadosCOLORES = new Empleado[n];

        for (int i=0; i<n; i++) {
            System.out.println("Ingrese nombre del Empleado para area de RRHH");
            String nombre = leer.next();


            System.out.println("Ingrese CI del Empleado");
            String ci = leer.next();

            System.out.println("Ingrese Edad del Empleado");
            int edad = leer.nextInt();

            Empleado emp1 = new Empleado(nombre, ci, edad);
            empleadosRRHH[i] = emp1;

        }


        Area area1 = new Area("RRHH", empleadosRRHH);

        for (int i=0; i<n; i++) {
            System.out.println("Ingrese nombre del Empleado para area Colores");
            String nombre = leer.next();


            System.out.println("Ingrese CI del Empleado");
            String ci = leer.next();

            System.out.println("Ingrese Edad del Empleado");
            int edad = leer.nextInt();

            Empleado emp2 = new Empleado(nombre, ci, edad);
            empleadosCOLORES[i] = emp2;
        }
        Area area2 = new Area("COLORES",empleadosCOLORES);

        Area[] areasFABERCASTELL = new Area[2];
        areasFABERCASTELL[0] = area1;
        areasFABERCASTELL[1] = area2;

        Empresa empresa = new Empresa("FABER CASTELL", areasFABERCASTELL);
        empresa.Imprimir();

    }
}
