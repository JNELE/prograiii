package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.MuertoVModel;
import com.Warcraft.Game.Model.OrcoModel;
import com.Warcraft.Game.Repository.MuertoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MuertosVService implements MuerteVServiceRepo {
    @Autowired
    private MuertoRepo muertoRepo;
    @Override
    public void saveData() {
        if(muertoRepo.count()==0){
            muertoRepo.save(new MuertoVModel("Necrofago","Mele",14,330,0,2));
            muertoRepo.save(new MuertoVModel("DemonioDeLaCripta","Distancia",33,150,0,2));
            muertoRepo.save(new MuertoVModel("Gargola","Volador",21,410,6,2));
            muertoRepo.save(new MuertoVModel("NigroMante","Mago",9,350,0,2));
            muertoRepo.save(new MuertoVModel("Banshee","Mago",13,285,0,2));
            muertoRepo.save(new MuertoVModel("CarroDeDespojos","Mecanico",88,380,2,3));
            muertoRepo.save(new MuertoVModel("Abominacion","Mele",39,1050,5,4));
            muertoRepo.save(new MuertoVModel("EstatuaDeObsidiana","Mecanico",8,800,4,3));
            muertoRepo.save(new MuertoVModel("WyrmDeHielo","Volador",105,1350,2,8));
            muertoRepo.save(new MuertoVModel("Lich","Heroe",58,925,5,5));
            muertoRepo.save(new MuertoVModel("CaballeroDeLaMuerte","Heroe",59,1275,8,5));
            muertoRepo.save(new MuertoVModel("SeniorDeLaCripta","Heroe",62,1375,2,5));
            muertoRepo.save(new MuertoVModel("SeniorDelTerror","Heroe",54,1150,6,5));

        }
    }

    @Override
    public List<MuertoVModel> obtenerUnidadesMuertos() {
        return new ArrayList<MuertoVModel>(muertoRepo.findAll());
    }

    @Override
    public Integer comida(String nombre, Integer cantidad) {
        MuertoVModel muertoVModel = muertoRepo.getMuertosUnidadesComida(nombre);
        Integer comida = muertoVModel.getComida();
        comida = comida*cantidad;
        return comida;
    }

    @Override
    public Integer datosUnidadsalud(String nombre) {
        MuertoVModel muertoVModel = muertoRepo.getMuertosUnidadesComida(nombre);
        Integer salud= muertoVModel.getSalud();
        return salud;
    }

    @Override
    public Integer datosUnidadArmadura(String nombre) {
        MuertoVModel muertoVModel = muertoRepo.getMuertosUnidadesComida(nombre);
        Integer armadura= muertoVModel.getArmadura();
        return armadura;
    }

    @Override
    public Integer datosUnidaddanio(String nombre) {
        MuertoVModel muertoVModel = muertoRepo.getMuertosUnidadesComida(nombre);
        Integer danio= muertoVModel.getDanio();
        return danio;
    }

    @Override
    public String datosUnidadtipo(String nombre) {
        MuertoVModel muertoVModel = muertoRepo.getMuertosUnidadesComida(nombre);
        String tipo= muertoVModel.getTipo();
        return tipo;
    }
}
