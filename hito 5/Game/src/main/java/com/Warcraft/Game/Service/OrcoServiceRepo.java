package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.OrcoModel;

import java.util.List;

public interface OrcoServiceRepo {
    public void saveData();
    public List<OrcoModel> obtenerUnidadesOrcos();
    Integer comida(String nombre, Integer cantidad);
    Integer datosUnidadsalud(String nombre);
    Integer datosUnidadArmadura(String nombre);
    Integer datosUnidaddanio(String nombre);
    String datosUnidadtipo(String nombre);
}
