package Examen2;

public class Ciudadano implements LeerInterface{
    private String primerNombre;
    private String primerApellido;
    private int ciNumber;
    private String ciExt;
    private int edad;

    public Ciudadano() {
        this.primerNombre = "";
        this.primerApellido = "";
        this.ciNumber = 0;
        this.ciExt = "";
        this.edad = 0;
    }
    public void Leer(){
        System.out.printf("Ingrese Primer nombre: ");
        this.primerNombre = LEER.next();
        System.out.printf("Ingrese Primer apellido: ");
        this.primerApellido = LEER.next();
        System.out.printf("Ingrese Numero CI: ");
        this.ciNumber = LEER.nextInt();
        System.out.printf("Ingrese Extension CI: ");
        this.ciExt = LEER.next();
        System.out.printf("Ingrese Edad: ");
        this.edad = LEER.nextInt();
    }
    public void Mostrar(){
        System.out.printf("Nombre : %s, Apellido : %s, Numero CI: %d, Extension CI: %s,Edad: %d %s",
                this.primerNombre,this.primerApellido,this.ciNumber,this.ciExt,this.edad, "\n");
    }
}
