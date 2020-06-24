package Calculadora;

public class Calculadora implements Suma,Resta,Multiplicacion,Division{

    public int suma(int a, int b) {
        return a+b;
    }


    public int resta(int a, int b) {
        return a-b;
    }


    public int multiplicacion(int a, int b) {
        return a*b;
    }


    public int division(int a, int b) {
        return a/b;
    }

    public void imprimir (String msg, int value){
        System.out.printf("%s %d %s",msg,value,"\n");
    }

}
