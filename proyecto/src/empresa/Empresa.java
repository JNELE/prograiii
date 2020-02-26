package empresa;

public class Empresa {
    private String nombre;
    private Area[] areas;

    public Empresa(String nombre1, Area[] areas1){
        this.nombre = nombre1;
        this.areas = areas1;
    }

    public void setAreas(Area[] areas){
        this.areas = areas;
    }

    public Area[] getAreas() {
        return this.areas;
    }

    public void Imprimir(){
        System.out.println("Nombre de la empresa: " + this.nombre);
        for (int i=0; i<this.areas.length; i++){
            this.areas[i].Imprimir();
        }
    }


}
