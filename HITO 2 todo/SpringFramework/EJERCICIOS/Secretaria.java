package EJERCICIOS;

public class Secretaria extends Oficinista {
    private String nombreArea;

    public Secretaria(){
        this.nombreArea = "";
    }

    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese nombre del Area: ");
        this.nombreArea = LEER.next();
    }
    public void Mostrar(){
        super.Mostrar();
        System.out.printf("nombre Area: %s %s",this.nombreArea, "\n");
    }
}
