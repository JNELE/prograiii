package empresa;

public class Empleado {
    private String nombre;
    private String ci;
    private int edad;

    public Empleado(String nombre1, String ci1, int edad1){
        this.nombre = nombre1;
        this.ci = ci1;
        this.edad = edad1;

    }

    public void setNombre(String newName){
        this.nombre = newName;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void Imprimir(){
        System.out.println("Nombre Empleado: " + this.nombre);
        System.out.println("CI Empleado: " + this.ci);
        System.out.println("Edad Empleado: " + this.edad);
    }

}
