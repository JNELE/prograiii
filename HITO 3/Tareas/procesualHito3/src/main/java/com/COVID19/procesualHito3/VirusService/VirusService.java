package com.COVID19.procesualHito3.VirusService;


import com.COVID19.procesualHito3.VirusModel.CasosModel;
import com.COVID19.procesualHito3.VirusRepo.CasosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VirusService implements VirusServiceInterfaz{
    @Autowired
    private CasosRepo casosRepo;

    @Override
    public CasosModel save(CasosModel cModel) {
        return casosRepo.save(cModel);
    }

    @Override
    public CasosModel update(CasosModel cModel, Integer idcoronavirus) {
        Optional<CasosModel> casos = casosRepo.findById(idcoronavirus);
        CasosModel casosUpdate = null;

        if (casos.isPresent()) {
            casosUpdate = casos.get();
            casosUpdate.setNombresdep(cModel.getNombredep());
            casosUpdate.setCasoscontagiados(cModel.getCasoscontagiados());
            casosUpdate.setCasossospechosos(cModel.getCasossospechosos());
            casosUpdate.setCasosrecuperados(cModel.getCasosrecuperados());
            casosRepo.save(casosUpdate);
        }
        return casosUpdate;
    }

    @Override
    public Integer delete(Integer idcoronavirus) {
        casosRepo.deleteById(idcoronavirus);
        return 1;
    }

    @Override
    public List<CasosModel> getAllcasos() {
        List<CasosModel> casos = new ArrayList<CasosModel>();
        casosRepo.findAll().forEach(casos::add);

        return casos;
    }

    @Override
    public CasosModel getcasosByIdcoronavirus(Integer idcoronavirus) {
        Optional<CasosModel> casos = casosRepo.findById(idcoronavirus);
        CasosModel cModel = null;

        if (casos.isPresent()) {
            cModel = casos.get();
        }
        return cModel;
    }

}
