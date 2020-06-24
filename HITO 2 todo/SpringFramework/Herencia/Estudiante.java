package Herencia;

public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String carrera,String nombres,String ap,int edad, String CI){
        super(nombres,ap,edad,CI);
    }

    public void imprimirEstudiante(){
        System.out.println(getCI());
    }



}
