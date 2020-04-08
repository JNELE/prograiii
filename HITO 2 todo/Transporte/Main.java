package Transporte;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setColor("Blanco");
        auto.setNroRuedas(4);
        auto.nroRuedas();
        auto.color();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setColor("azul");
        bicicleta.setNroRuedas(2);
        bicicleta.nroRuedas();
        bicicleta.color();

    }
}
