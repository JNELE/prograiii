package EJERCICIOS;

public class Mensajero extends Oficinista{
    private String turno;

    public Mensajero(){
        this.turno = "";
    }

    public void Leer(){
        super.Leer();

        System.out.printf("Ingrese turno: ");
        this.turno = LEER.next();
    }
    public void Mostrar(){
        super.Mostrar();
        System.out.printf("turno: %s %s",this.turno, "\n");
    }

}
