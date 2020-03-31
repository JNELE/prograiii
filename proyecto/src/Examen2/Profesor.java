package Examen2;

public class Profesor extends Persona{
    private int cargaH;
    private String ciudad;
    private int nroMaterias;
    private String Materias[];

    public Profesor() {
        this.cargaH = 0;
        this.ciudad = "";
        this.nroMaterias = 0;
        this.Leer();
    }

    public void Leer(){
        super.Leer();
        System.out.printf("Ingrese cargaH: ");
        this.cargaH = LEER.nextInt();
        System.out.printf("Ingrese ciudad: ");
        this.ciudad = LEER.next();
        Leer1();

    }

    public void Leer1(){
        System.out.println("ingrese el numero de materias");
        int tamaño = LEER.nextInt();
        Materias = new String[tamaño];
        for(int i=0;i<tamaño;i++){
            System.out.printf("Ingrese las materias %s\n",i);
            int numeroLeido = LEER.nextInt();
            Materias[i] = String.valueOf(numeroLeido);
        }
    }

    public void Mostrar(){
        super.Mostrar();
        System.out.printf("CargaH: %s",this.cargaH);
        System.out.printf("Ciudad: %s",this.ciudad);
        System.out.printf("nro destinos: %d",this.nroMaterias);
        for(int i=0;i<Materias.length;i++)
            System.out.printf("destinos %d: %s",i,this.Materias);

    }


    public void verificarProfes(){
        for(int i=0;i<nroMaterias;i++)
        while(LEER.hasNext()){
            if(Materias[i] == Materias[i]){
                System.out.println("Tienen una misma materia" + i);
            }
        }
    }
}





