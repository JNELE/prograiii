package Transporte;

public class Auto implements Vehiculo {
    private int nroRuedas;
    private String color;

    public void nroRuedas(){
        System.out.printf("Nro de ruedas del auto: %d\n", this.getNroRuedas());
    }

    public void color() {
        System.out.printf("Color del auto: %s\n", this.getColor());
    }

    public void setNroRuedas(int nroRuedas){
        this.nroRuedas = nroRuedas;
    }
    public int getNroRuedas(){
        return this.nroRuedas;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

}
