package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.OrcoModel;
import com.Warcraft.Game.Repository.OrcoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrcoService implements OrcoServiceRepo {

    @Autowired
    private OrcoRepo OrcoRepo;



    @Override
    public void saveData() {
        if (OrcoRepo.count() == 0) {
            OrcoRepo.save(new OrcoModel("Grunt", "Mele", 21, 700, 1, 3));
            OrcoRepo.save(new OrcoModel("TrollArrancaCabezas", "Distancia", 27, 300, 0, 2));
            OrcoRepo.save(new OrcoModel("Demoledor", "Mecanico", 102, 325, 2, 4));
            OrcoRepo.save(new OrcoModel("Incursor", "Mele", 27, 660, 0, 3));
            OrcoRepo.save(new OrcoModel("BestiaKodo", "Distancia", 30, 840, 1, 4));
            OrcoRepo.save(new OrcoModel("Tauren", "Mele", 44, 1300, 4, 5));
            OrcoRepo.save(new OrcoModel("CuranderoTroll", "Mago", 14, 250, 0, 2));
            OrcoRepo.save(new OrcoModel("Chaman", "Mago", 9, 350, 0, 2));
            OrcoRepo.save(new OrcoModel("EspirituCaminante", "Mago", 8, 5, 8, 3));
            OrcoRepo.save(new OrcoModel("GineteMurcielago", "Volador", 12, 500, 0, 2));
            OrcoRepo.save(new OrcoModel("GinetedeViento", "Volador", 37, 550, 0, 3));
            OrcoRepo.save(new OrcoModel("MaestroDeLasEspadas", "Heroe", 62, 1000, 9, 5));
            OrcoRepo.save(new OrcoModel("JefeTauren", "Heroe", 65, 1425, 6, 5));
            OrcoRepo.save(new OrcoModel("Vidente", "Heroe", 54, 925, 6, 5));
            OrcoRepo.save(new OrcoModel("CasadorDeLasSombras", "Heroe", 41, 925, 8, 5));
        }
    }

    @Override
    public List<OrcoModel> obtenerUnidadesOrcos() {
        return new ArrayList<OrcoModel>(OrcoRepo.findAll());
    }

    @Override
    public Integer comida(String nombre ,Integer cantidad) {
        OrcoModel orcoModel = OrcoRepo.getOrcoUnidadesComida(nombre);
        Integer comida = orcoModel.getComida();
        comida = comida*cantidad;
        return comida;
    }

    @Override
    public Integer datosUnidadsalud(String nombre) {
        OrcoModel orcoModel = OrcoRepo.getOrcoUnidadesComida(nombre);
        Integer salud = orcoModel.getSalud();
        return salud;
    }

    @Override
    public Integer datosUnidadArmadura(String nombre) {
        OrcoModel orcoModel = OrcoRepo.getOrcoUnidadesComida(nombre);
        Integer armor = orcoModel.getArmadura();
        return armor;
    }

    @Override
    public Integer datosUnidaddanio(String nombre) {
        OrcoModel orcoModel = OrcoRepo.getOrcoUnidadesComida(nombre);
        Integer danio= orcoModel.getDanio();
        return danio;
    }

    @Override
    public String datosUnidadtipo(String nombre) {
        OrcoModel orcoModel = OrcoRepo.getOrcoUnidadesComida(nombre);
        String tipo= orcoModel.getTipo();
        return tipo;
    }


}
