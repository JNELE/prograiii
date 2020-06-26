package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.ElfoModel;
import com.Warcraft.Game.Model.HumanoModel;

import java.util.List;

public interface ElfoServiceRepo {
    public void saveData();
    public List<ElfoModel> obtenerUnidadesElfo();
    Integer comida(String nombre, Integer cantidad);
    Integer datosUnidadsalud(String nombre);
    Integer datosUnidadArmadura(String nombre);
    Integer datosUnidaddanio(String nombre);
    String datosUnidadtipo(String nombre);
}
