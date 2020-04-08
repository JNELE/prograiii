package EJERCICIOS;

public class Oficinista extends Empleado {
    private String codArea;
    private int sueldoBasico;

    public Oficinista(){
        this.codArea = "";
        this.sueldoBasico = 0;
    }

    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese codArea: ");
        this.codArea = LEER.next();
        System.out.printf("Ingrese sueldo basico: ");
        this.sueldoBasico = LEER.nextInt();

    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("codArea: %s,Sueldo Basico :%d %s",this.codArea, this.sueldoBasico, "\n");
    }
}
