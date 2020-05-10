package com.COVID19.procesualHito3.VirusService;

import com.COVID19.procesualHito3.VirusModel.CasosModel;

import java.util.List;

public interface VirusServiceInterfaz {
    public CasosModel save(CasosModel cModel);
    public CasosModel update(CasosModel cModel, Integer idcoronavirus);
    public Integer delete(Integer idcoronavirus);
    public List<CasosModel> getAllcasos();
    public CasosModel getcasosByIdcoronavirus(Integer idcoronavirus);
}
