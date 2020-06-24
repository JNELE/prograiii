package ManejoInterfaz;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5,10);
        System.out.println("El area del rectagulo es: " + rectangulo.area());
        Circulo circulo = new Circulo(5);
        System.out.println("El area del circulo es: " + circulo.area());
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("El area del cuadrado es: " + cuadrado.area());
    }
}
