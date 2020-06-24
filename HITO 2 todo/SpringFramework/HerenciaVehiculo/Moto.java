package HerenciaVehiculo;

public class Moto extends Vehiculo{

    public Moto(String placa,int NroRuedas,int NroAsientos){
        super(placa, NroRuedas, NroAsientos);
    }

    public void imprimirPlaca(){
        System.out.println(getPlaca());
    }
}
