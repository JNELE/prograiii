package EJERCICIOS;

public class Empleado implements LeerInterface{
    private String primerNombre;
    private String primerApellido;
    private int ciNumero;
    private String ciExtension;

    public Empleado() {
        this.primerNombre = "";
        this.primerApellido = "";
        this.ciNumero = 0;
        this.ciExtension = "";
    }

    public void Leer(){
        System.out.printf("Ingrese Primer nombre: ");
        this.primerNombre = LEER.next();
        System.out.printf("Ingrese Primer apellido: ");
        this.primerApellido = LEER.next();
        System.out.printf("Ingrese Numero CI: ");
        this.ciNumero = LEER.nextInt();
        System.out.printf("Ingrese Extension CI: ");
        this.ciExtension = LEER.next();
    }

    public void Mostrar(){
        System.out.printf("Nombre : %s, Apellido : %s, Numero CI: %d, Extension CI: %s %s",
                this.primerNombre,this.primerApellido,this.ciNumero,this.ciExtension, "\n");
    }
}
