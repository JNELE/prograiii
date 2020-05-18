package com.spring.app.Model;

import org.springframework.stereotype.Repository;

@Repository

public class ModelPersona implements InterfaceModelPersona {
    @Override
    public void Insertar(String nombre) {
        System.out.println("Nombre Insertado " + nombre);
    }
}
