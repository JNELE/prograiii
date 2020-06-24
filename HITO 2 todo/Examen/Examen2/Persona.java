package Examen2;

public class Persona extends Ciudadano{
    private String etapaCrecimineto;

    public Persona() {
        this.etapaCrecimineto = "";
    }

    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese etapa de crecimiento: ");
        this.etapaCrecimineto = LEER.next();
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("etapa crecimiento : %s %s", this.etapaCrecimineto, "\n");
    }

}
