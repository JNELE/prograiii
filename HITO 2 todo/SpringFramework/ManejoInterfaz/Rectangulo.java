package ManejoInterfaz;

public class Rectangulo implements Figura {
    private float lado;
    private float altura;


    public double area() {
        double res;
        res=lado*altura;
        return res;
    }

    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }




}
