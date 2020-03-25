package Herencia;

public class Persona {
    public String nombres;
    public String apellidos;
    public int edad;
    public String CI;

    public Persona(String nombres,String apellidos,int edad,String CI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.CI = CI;
    }

    public void setCI(String ci){
        this.CI = ci;
    }

    public String getCI(){
        return this.CI;
    }

}
