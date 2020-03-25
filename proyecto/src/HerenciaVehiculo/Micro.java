package HerenciaVehiculo;

public class Micro extends Vehiculo {

    public Micro(String placa,int NroRuedas,int NroAsientos){
        super(placa, NroRuedas, NroAsientos);
    }

    public void imprimirPlaca(){
        System.out.println(getPlaca());
    }
}
