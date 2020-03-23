package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.imprimir("La suma es: ",calc.suma(5,5));
        calc.imprimir("La resta es: ",calc.resta(15,5));
        calc.imprimir("La multiplicacion es: ",calc.multiplicacion(2,5));
        calc.imprimir("La division es: ",calc.division(10,5));


    }


}
