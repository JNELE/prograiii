package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.HumanoModel;
import com.Warcraft.Game.Model.OrcoModel;

import java.util.List;

public interface HumanServiceRepo {
    public void saveData();
    public List<HumanoModel> obtenerUnidadesHumanos();
    Integer comida(String nombre, Integer cantidad);
    Integer datosUnidadsalud(String nombre);
    Integer datosUnidadArmadura(String nombre);
    Integer datosUnidaddanio(String nombre);
    String datosUnidadtipo(String nombre);
}
