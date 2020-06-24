package HerenciaVehiculo;

public class Trufi extends Vehiculo{

    public Trufi(String placa,int NroRuedas,int NroAsientos){
        super(placa, NroRuedas, NroAsientos);
    }

    public void imprimirPlaca(){
        System.out.println(getPlaca());
    }

}
