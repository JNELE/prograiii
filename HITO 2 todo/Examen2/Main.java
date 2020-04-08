package Examen2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Policia po1 = new Policia();
//        Policia po2 = new Policia();
//        po1.Leer();
//        //  po2.Leer();
//
//        Profesor pf1 = new Profesor();
//        Profesor pf2 = new Profesor();
//        pf1.Leer();
////        pf2.Leer();
////        pf2.Mostrar();
//
//        System.out.println(pf1.verificaCiudad(po1.getDestinos()));

        Departamento dep=new Departamento();
        dep.Leer();
         dep.Mostrar();
        System.out.println();

        Policia po1= new Policia();
        po1.Leer();
        po1.Mostrar();
        System.out.println();

        System.out.println(po1.verificaDepartamento(po1.getDestinos(),dep.getNombreDep()));





    }
}