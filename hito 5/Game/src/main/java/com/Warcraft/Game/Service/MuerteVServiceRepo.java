package com.Warcraft.Game.Service;

import com.Warcraft.Game.Model.MuertoVModel;


import java.util.List;

public interface MuerteVServiceRepo {
    public void saveData();
    public List<MuertoVModel> obtenerUnidadesMuertos();
    Integer comida(String nombre, Integer cantidad);
    Integer datosUnidadsalud(String nombre);
    Integer datosUnidadArmadura(String nombre);
    Integer datosUnidaddanio(String nombre);
    String datosUnidadtipo(String nombre);
}
