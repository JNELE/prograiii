package com.spring.app.Services;

import com.spring.app.Model.ModelPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePersona implements InterfaceServicePersona {
    @Autowired
    private ModelPersona mPersona;

    @Override
    public void Insertar(String nombre) {
        mPersona.Insertar(nombre);
    }
}
