package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.HumanoModel;
import com.Warcraft.Game.Model.MuertoVModel;
import com.Warcraft.Game.Repository.HumanRepo;
import com.Warcraft.Game.Repository.MuertoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HumanService implements HumanServiceRepo {
    @Autowired
    private HumanRepo humanRepo;
    @Override
    public void saveData() {
        if(humanRepo.count()==0){
            humanRepo.save(new HumanoModel("SoldadoRazo","Mele",14,420,4,2));
            humanRepo.save(new HumanoModel("Fucilero","Distancia",24,520,0,3));
            humanRepo.save(new HumanoModel("Caballero","Mele",35,900,5,4));
            humanRepo.save(new HumanoModel("Echizera","Mago",30,325,0,2));
            humanRepo.save(new HumanoModel("Sacerdote","Mago",20,290,0,2));
            humanRepo.save(new HumanoModel("DesacedorDeEchizos","Distancia",15,650,3,3));
            humanRepo.save(new HumanoModel("MaquinaVoladora","Volador",8,175,2,1));
            humanRepo.save(new HumanoModel("Mortero","Distancia",64,360,0,2));
            humanRepo.save(new HumanoModel("MotorDeAsedio","Mecanico",55,700,2,3));
            humanRepo.save(new HumanoModel("JineteDeGrifos","Volador",55,825,0,4));
            humanRepo.save(new HumanoModel("JineteDeDragonHawk","Volador",20,575,0,3));
            humanRepo.save(new HumanoModel("MagoSanguinario","Heroe",54,1000,5,5));
            humanRepo.save(new HumanoModel("Paladin","Heroe",58,1250,8,5));
            humanRepo.save(new HumanoModel("ReyDeLaMontania","Heroe",63,1375,11,5));
            humanRepo.save(new HumanoModel("ArchiMago","Heroe",55,850,6,5));
        }
    }

    @Override
    public List<HumanoModel> obtenerUnidadesHumanos() {
        return new ArrayList<HumanoModel>(humanRepo.findAll());
    }

    @Override
    public Integer comida(String nombre, Integer cantidad) {
        HumanoModel humanoModel = humanRepo.getHumanUnidadesComida(nombre);
        Integer comida = humanoModel.getComida();
        comida = comida*cantidad;
        return comida;
    }

    @Override
    public Integer datosUnidadsalud(String nombre) {
        HumanoModel humanoModel = humanRepo.getHumanUnidadesComida(nombre);
        Integer salud= humanoModel.getSalud();
        return salud;
    }

    @Override
    public Integer datosUnidadArmadura(String nombre) {
        HumanoModel humanoModel = humanRepo.getHumanUnidadesComida(nombre);
        Integer armadura= humanoModel.getArmadura();
        return armadura;
    }

    @Override
    public Integer datosUnidaddanio(String nombre) {
        HumanoModel humanoModel = humanRepo.getHumanUnidadesComida(nombre);
        Integer danio= humanoModel.getDanio();
        return danio;
    }

    @Override
    public String datosUnidadtipo(String nombre) {
        HumanoModel humanoModel = humanRepo.getHumanUnidadesComida(nombre);
        String tipo= humanoModel.getTipo();
        return tipo;
    }
}
