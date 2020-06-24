package HerenciaVehiculo;

public class Vehiculo {
    public String placa;
    public int NroRuedas;
    public int NroAsientos;

    public Vehiculo(String placa,int NroRuedas,int NroAsientos) {
        this.placa = placa;
        this.NroRuedas = NroRuedas;
        this.NroAsientos = NroAsientos;

    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return this.placa;
    }



}
