package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.ElfoModel;
import com.Warcraft.Game.Model.HumanoModel;
import com.Warcraft.Game.Repository.ElfoRepo;
import com.Warcraft.Game.Repository.HumanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElfoService implements ElfoServiceRepo {
    @Autowired
    private ElfoRepo elfoRepo;
    @Override
    public void saveData() {
        if(elfoRepo.count()==0){
            elfoRepo.save(new ElfoModel("Arquera","Distancia",18,245,0,2));
            elfoRepo.save(new ElfoModel("Casadora","Distancia",18,600,2,3));
            elfoRepo.save(new ElfoModel("TiradorDeSables","Mecanico",53,300,2,3));
            elfoRepo.save(new ElfoModel("HipoGrifo","Volador",57,525,0,2));
            elfoRepo.save(new ElfoModel("GruidaDeLaGarra","Mago",13,300,0,2));
            elfoRepo.save(new ElfoModel("DragonFaerico","Volador",16,450,0,2));
            elfoRepo.save(new ElfoModel("Driade","Distancia",19,435,0,3));
            elfoRepo.save(new ElfoModel("DruidaDeLaZarpa","Mele",44,960,3,4));
            elfoRepo.save(new ElfoModel("GiganteDeLaMontania","Mele",40,1600,4,10));
            elfoRepo.save(new ElfoModel("Quimera","Volador",83,1000,2,6));
            elfoRepo.save(new ElfoModel("Guardiana","Heroe",36,1075,8,5));
            elfoRepo.save(new ElfoModel("GuardianDelBosque","Heroe",50,900,6,5));
            elfoRepo.save(new ElfoModel("SacerdotizaDeLaLuna","Heroe",44,975,8,5));
            elfoRepo.save(new ElfoModel("CazadorDeDemonios","Heroe",59,1100,9,5));

        }
    }

    @Override
    public List<ElfoModel> obtenerUnidadesElfo() {
        return new ArrayList<ElfoModel>(elfoRepo.findAll());
    }

    @Override
    public Integer comida(String nombre, Integer cantidad) {
        ElfoModel elfoModel = elfoRepo.getElfoUnidadesComida(nombre);
        Integer comida = elfoModel.getComida();
        comida = comida*cantidad;
        return comida;
    }

    @Override
    public Integer datosUnidadsalud(String nombre) {
        ElfoModel elfoModel = elfoRepo.getElfoUnidadesComida(nombre);
        Integer salud= elfoModel.getSalud();
        return salud;
    }

    @Override
    public Integer datosUnidadArmadura(String nombre) {
        ElfoModel elfoModel = elfoRepo.getElfoUnidadesComida(nombre);
        Integer armadura= elfoModel.getArmadura();
        return armadura;
    }

    @Override
    public Integer datosUnidaddanio(String nombre) {
        ElfoModel elfoModel = elfoRepo.getElfoUnidadesComida(nombre);
        Integer danio= elfoModel.getDanio();
        return danio;
    }

    @Override
    public String datosUnidadtipo(String nombre) {
        ElfoModel elfoModel = elfoRepo.getElfoUnidadesComida(nombre);
        String tipo= elfoModel.getTipo();
        return tipo;
    }
}
