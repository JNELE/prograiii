package ManejoInterfaz;

public class Cuadrado implements Figura {
    private float lado;


    public double area() {
        double res= lado*lado;
        return res;
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
}
