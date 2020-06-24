package Vectores;

import java.util.Scanner;

public class Vectores implements ordenar{
    private Integer vec[];
    private Scanner leer;

    public Vectores(){
        leer = new Scanner(System.in);
    }
    public void leerVector(){
        System.out.println("Ingrese nro de elementos del vector ");
        int tamaño = leer.nextInt();
        vec = new Integer[tamaño];
        for(int i=0;i<tamaño;i++){
            System.out.printf("Ingrese numero posicion %d\n",i);
            int numeroLeido = leer.nextInt();
            vec[i] = numeroLeido;
        }
    }
    public void mostarVector(){
        for(int i=0;i<vec.length;i++){
            System.out.printf("Valor = %d\n", vec[i]);
        }
    }
    public void burbuja(){
        for(int i=0;i<vec.length;i++){
            for(int j= i+1;j<vec.length;j++){
                if(vec[i]>vec[j]){
                    int aux= vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;

                }
            }
        }


    }

    public void inserccion() {

    }


    public void seleccion() {

    }
}





