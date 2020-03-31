package Examen2;

public class Policia extends Persona {
    private String turno;
    private int nroDestinos;
    private String destinos[];

    public Policia() {
        this.turno = "";
        this.nroDestinos = 0;
        this.Leer();
    }


    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese turno: ");
        this.turno = LEER.next();
        Leer1();

    }


    public void Leer1(){
        System.out.println("ingrese el numero de destinos");
        int tamaño = LEER.nextInt();
        destinos = new String[tamaño];
        for(int i=0;i<tamaño;i++){
            System.out.printf("Ingrese los destinos %s\n",i);
            int numeroLeido = LEER.nextInt();
            destinos[i] = String.valueOf(numeroLeido);
    }
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("Turno: %s",this.turno);
        System.out.printf("nro destinos: %d",this.nroDestinos);
        for(int i=0;i<destinos.length;i++)
        System.out.printf("destinos %d: %s",i,this.destinos);
    }

}


