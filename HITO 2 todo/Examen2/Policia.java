package Examen2;

import java.util.Arrays;

public class Policia implements LeerInterface{//extends Persona{
    private String[] nombrePolicia;
    private String[] apellidoPolicia;
    private int n;
    private String[] turno;
    private int[] nroDestinos;
    private String[] destinos;

    public Policia() {
       this.n=0;
    }

    public void Leer(){
        //super.Leer();
        System.out.printf("Ingrese cantidad de policias: ");
        this.n = LEER.nextInt();
        this.nombrePolicia = new String[this.n];
        this.apellidoPolicia = new String[this.n];
        this.turno = new String[this.n];
        this.nroDestinos = new int[this.n];
        //this.destinos = new String[this.n];

        for(int i=0; i<this.n; i++){
            System.out.printf("Ingrese nombre: ");
            this.nombrePolicia[i] = LEER.next();

            System.out.printf("Ingrese apellido: ");
            this.apellidoPolicia[i] = LEER.next();

            System.out.printf("Ingrese turno: ");
            this.turno[i] = LEER.next();

            System.out.printf("Ingrese nroDestinos: ");
            this.nroDestinos[i] = LEER.nextInt();
            this.destinos = new String[this.nroDestinos[i]];
            for(int j=0; j<this.nroDestinos[i]; j++){
                System.out.printf("Ingrese destino: ");
                this.destinos[j] = LEER.next();
                System.out.println();

             }


        }
    }
    public void Mostrar(){
        //super.Mostrar();
        //System.out.printf("cantidad de policias: %d,turno: %s,nro destinos: %d %s",this.n, this.turno,this.nroDestinos, "\n");
        for(int i=0; i<this.n; i++){
            System.out.printf("cantidad de policias: %d,nombre policia: %s,apellido policia: %s,turno: %s,nroDestino: %d %s",this.n,this.nombrePolicia[i],this.apellidoPolicia[i], this.turno[i],this.nroDestinos[i],"\n");
            for(int j=0; j<this.nroDestinos[i]; j++){
                System.out.printf("Destino: %d: %s",j,this.destinos[j]);//Destinos: 0 Cochabamba

            }

        }

    }


    public String[] getDestinos(){
        return this.destinos;
    }


    public String verificaDepartamento(String[] destinos,String[] departamento){
        int conta=0;
        String res = "";
        for(int i=0; i<destinos.length; i++){

            for(int j=0; j<departamento.length; j++){
                if (destinos.length == departamento.length){
                    res=String.valueOf(conta++);
                }
            }
        }
        return res;
    }


}



