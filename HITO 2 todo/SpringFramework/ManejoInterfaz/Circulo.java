package ManejoInterfaz;

public class Circulo implements Figura {
    private double diametro;


    public double area() {
        double res= PI * ((diametro/2)*(diametro/2));
        return res;
    }

    public Circulo(double diametro) {
        this.diametro = diametro;
    }
}
