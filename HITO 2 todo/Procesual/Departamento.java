package Examen2;

public class Departamento implements LeerInterface{
    private int cantidad;
    private String[] nombreDep;

    public Departamento() {
        this.cantidad = 0;

    }

//    public int getCantidad() {
//        return this.cantidad;
//    }
//
//    public void setCantidad(int cantidad) {
//        this.cantidad = cantidad;
//    }

    public String[] getNombreDep() {
        return this.nombreDep;
    }
//
//    public void setNombreDep(String[] nombreDep) {
//        this.nombreDep = nombreDep;
//    }

    public void Leer(){
        System.out.printf("Ingrese cantidad de departamentos: ");
        this.cantidad = LEER.nextInt();
        this.nombreDep = new String[this.cantidad];
        for(int i=0; i<this.cantidad; i++){
            System.out.printf("Ingrese departamentos: ");
            this.nombreDep[i] = LEER.next();
            System.out.println();
        }

//        System.out.printf("Cantidad: ");
//        this.cantidad = LEER.nextInt();
//        System.out.printf("Nombre Departamento: ");
//        this.nombreDep = LEER.next();
    }

    public void Mostrar(){
//        System.out.printf("Cantidad: %d, Nombre Departamento:  %s %s", this.cantidad,this.nombreDep, "\n");
        System.out.printf("cantidad: %d %s ", this.cantidad, "\n");
        for(int j=0; j<this.cantidad; j++){
            System.out.printf("Departamentos: %s: %s ",j,this.nombreDep[j]);//Destinos: 0 Cochabamba
        }
    }


}
