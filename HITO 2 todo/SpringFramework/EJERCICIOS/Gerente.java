package EJERCICIOS;

public class Gerente extends Empleado{
    private int bono;
    private int sueldo;
    private int antiguedad;

    public Gerente(){
        this.bono = 0;
        this.sueldo = 0;
        this.antiguedad = 0;
    }

    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese bono: ");
        this.bono = LEER.nextInt();
        System.out.printf("Ingrese sueldo: ");
        this.sueldo = LEER.nextInt();
        System.out.printf("Ingrese antiguedad: ");
        this.antiguedad = LEER.nextInt();
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("Bono : %d, Sueldo : %d, Antiguedad: %d %s", this.bono,this.sueldo,this.antiguedad, "\n");
    }

}
