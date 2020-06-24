package EJERCICIOS;
import javax.management.StringValueExp;
import java.util.*;

public class Ejercicios {

    void menu() {

        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("5. Salir");
    }
    private Scanner leer;
    private Integer vec[];
    private String resultadoSerie = "";


    public Ejercicios(){
        leer = new Scanner(System.in);
    }
    //////////////////////////////////////////////////////////
    public String SerieFibonacci(int n)
    {

        int conta = 0;
        int a=1,b=1;
        int auxi = 0;

        while (conta < n)
        {
            auxi = a + b;
            resultadoSerie = resultadoSerie + String.valueOf(auxi) + "," ;
            a = b;
            b = auxi;
            conta ++;
        }
        return resultadoSerie;
    }
    public void imprimirSerie(){
        System.out.println(resultadoSerie);
    }

/////////////////////////////////////////////////////////////////////////////



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

    public void seleccion(){
        int i, j, menor, pos, tmp;
        for (i = 0; i < vec.length - 1; i++) { // tomamos como menor el primero
            menor = vec[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (j = i + 1; j < vec.length; j++){ // buscamos en el resto
                if (vec[j] < menor) { // del array algún elemento
                    menor = vec[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){ // si hay alguno menor se intercambia
                tmp = vec[i];
                vec[i] = vec[pos];
                vec[pos] = tmp;
            }
        }
    }

/////////////////////////////////////////////////////

    public void EncontrarCadena(){
        System.out.println("INGRESE TEXTO");
        while(leer.hasNext()){
            String cadena = leer.nextLine();
            if(cadena.length() == 10){
                System.out.println("CADENA ENCONTRADA");
            }
        }

    }
    ////////////////////////////////////////
    private Integer array[];
    public void ParesenArray(){

        System.out.println("ingrese el tamaño para el array");
        int tamaño = leer.nextInt();
        array = new Integer[tamaño];

        for(int i=0;i<tamaño;i++){
            System.out.printf("Ingrese los valores del array %d\n",i);
            int numeroLeido = leer.nextInt();
            array[i] = numeroLeido;
        }
        for (int i = 0; i < 10; i++) {
           if( array[i] % 2 == 0){
               System.out.println("LOS NUMEROS PARES DE LA MATRIZ SON: " + array[i]);

           }
        }

    }
////////////////////////////////////////////////





}
