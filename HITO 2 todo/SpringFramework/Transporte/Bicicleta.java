package Transporte;

public class Bicicleta implements Vehiculo {
    private int nroRuedas;
    private String color;

    public void color() {
        System.out.printf("Color de la Bicicleta es: %s\n",this.getColor());
    }
    public void nroRuedas() {
        System.out.printf("Nro de ruedas de la Bicicleta es: %d\n",this.getNroRuedas());
    }
    public int getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.nroRuedas = nroRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
