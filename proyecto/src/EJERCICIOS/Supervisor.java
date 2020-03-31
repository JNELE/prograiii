package EJERCICIOS;

public class Supervisor extends Empleado{
    private int sueldo;
    private int antiguedad;

    public Supervisor(){
        this.sueldo = 0;
        this.antiguedad = 0;
    }
    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese sueldo: ");
        this.sueldo = LEER.nextInt();
        System.out.printf("Ingrese antiguedad: ");
        this.antiguedad = LEER.nextInt();
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("Sueldo : %d, Antiguedad: %d %s", this.sueldo,this.antiguedad, "\n");
    }

}
