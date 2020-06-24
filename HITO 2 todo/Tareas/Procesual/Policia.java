package Examen2;

public class Policia extends Persona {
    private String turno;
    private int nroDestinos;
    private String[] destinos;

    public Policia() {
        this.turno = "";
        this.nroDestinos = 0;

    }


    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese turno: ");
        this.turno = LEER.next();
        System.out.printf("Ingrese nro Destinos: ");
        this.nroDestinos = LEER.nextInt();
        this.destinos = new String[this.nroDestinos];

        for(int i=0; i<this.nroDestinos; i++){
            System.out.printf("Ingrese destino: ");
            this.destinos[i] = LEER.next();
            System.out.println();
        }
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("Turno: %s,Nro Destinos: %d %s", this.turno,this.nroDestinos, "\n");
        for(int j=0; j<this.nroDestinos; j++){
            System.out.printf("Destino: %d: %s",j,this.destinos[j]);//Destinos: 0 Cochabamba

        }
    }
    public String[] getDestinos(){
        return this.destinos;
    }



}


