package com.COVID19.Hito3.Services;

import com.COVID19.Hito3.Models.ModelCoronaVirusPaciente;
import com.COVID19.Hito3.Repos.PacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService implements PacienteServiceInterfaz{
    @Autowired
    private PacienteRepo pacienteRepo;

    @Override
    public ModelCoronaVirusPaciente save(ModelCoronaVirusPaciente cModel) {
        if(cModel.getEdad() > 20){
            cModel.setCategoria("ADULTO");
            cModel.setFullname((cModel.getNombre_paciente() + cModel.getApellidos_paciente()));

        }
        else if(cModel.getEdad()<20 && cModel.getEdad()>9){
            cModel.setCategoria("ADOLESCENTE");
            cModel.setFullname((cModel.getNombre_paciente() + cModel.getApellidos_paciente()));

        }
        else{
            cModel.setCategoria("NINO");
            cModel.setFullname((cModel.getNombre_paciente() + cModel.getApellidos_paciente()));

        }
        return pacienteRepo.save(cModel);
    }

    @Override
    public ModelCoronaVirusPaciente save2(ModelCoronaVirusPaciente cModel) {
        if(cModel.getEdad() > 70){
            return null;
        }
        else{

            if(cModel.getEdad() > 20){
                cModel.setCategoria("ADULTO");
                cModel.setFullname((cModel.getNombre_paciente() + cModel.getApellidos_paciente()));

            }
            else if(cModel.getEdad()<20 && cModel.getEdad()>9){
                cModel.setCategoria("ADOLESCENTE");
                cModel.setFullname((cModel.getNombre_paciente() + cModel.getApellidos_paciente()));

            }
            else{
                cModel.setCategoria("NINO");
                cModel.setFullname((cModel.getNombre_paciente() + cModel.getApellidos_paciente()));

            }
            return pacienteRepo.save(cModel);
        }

    }


    @Override
    public ModelCoronaVirusPaciente update(ModelCoronaVirusPaciente cModel, Integer id_corona_virus) {
        Optional<ModelCoronaVirusPaciente> paciente = pacienteRepo.findById(id_corona_virus);
        ModelCoronaVirusPaciente pacienteUpdate = null;

        if (paciente.isPresent()) {
            pacienteUpdate = paciente.get();
            pacienteUpdate.setNombre_dep(cModel.getNombre_dep());
            pacienteUpdate.setNombre_paciente(cModel.getNombre_paciente());
            pacienteUpdate.setApellidos_paciente(cModel.getApellidos_paciente());
            pacienteUpdate.setEdad(cModel.getEdad());
            if(cModel.getEdad() < 10){
                pacienteUpdate.setCategoria("NINO");
            } else if(cModel.getEdad() < 20){
                pacienteUpdate.setCategoria("ADOLESCENTE");
            }
            else{
                pacienteUpdate.setCategoria("ADULTO");
            }
            pacienteUpdate.setFullname(cModel.getNombre_paciente() +"-"+ cModel.getApellidos_paciente());
            pacienteUpdate.setCasos_contagiados(cModel.getCasos_contagiados());
            pacienteUpdate.setCasos_sospechosos(cModel.getCasos_sospechosos());
            pacienteUpdate.setCasos_recuperados(cModel.getCasos_recuperados());
            pacienteRepo.save(pacienteUpdate);
        }
        return pacienteUpdate;
    }

    @Override
    public Integer delete() {
        pacienteRepo.deleteAll();
        return 1;
    }

    @Override
    public List<ModelCoronaVirusPaciente> getAllpaciente() {
        List<ModelCoronaVirusPaciente> paciente = new ArrayList<ModelCoronaVirusPaciente>();
        pacienteRepo.findAll().forEach(paciente::add);

        return paciente;
    }

    @Override
    public ModelCoronaVirusPaciente getcasosById_corona_virus(Integer id_corona_virus) {
        Optional<ModelCoronaVirusPaciente> paciente = pacienteRepo.findById(id_corona_virus);
        ModelCoronaVirusPaciente cModel = null;

        if (paciente.isPresent()) {
            cModel = paciente.get();
        }
        return cModel;
    }

}

