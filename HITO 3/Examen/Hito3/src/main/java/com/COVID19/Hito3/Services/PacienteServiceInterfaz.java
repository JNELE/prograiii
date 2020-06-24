package com.COVID19.Hito3.Services;

import com.COVID19.Hito3.Models.ModelCoronaVirusPaciente;

import java.util.List;

public interface PacienteServiceInterfaz {
    public ModelCoronaVirusPaciente save(ModelCoronaVirusPaciente cModel);
    public ModelCoronaVirusPaciente save2(ModelCoronaVirusPaciente cModel);
    public ModelCoronaVirusPaciente update(ModelCoronaVirusPaciente cModel, Integer id_corona_virus);
    public Integer delete();
    public List<ModelCoronaVirusPaciente> getAllpaciente();
    public ModelCoronaVirusPaciente getcasosById_corona_virus(Integer id_corona_virus);
}