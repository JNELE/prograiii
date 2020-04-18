package com.Corona.Virus.Model;

import org.springframework.stereotype.Repository;

@Repository
public class CoronaVirusModel implements InterfaceCoronaVirusModel {

    @Override
    public void LEER(String dept, int cc, int cs) {
        System.out.println("Datos ingresados: " + dept + cc + cs);
    }

    @Override
    public void Mostrar() {
        System.out.println("Mostrar");
    }
}