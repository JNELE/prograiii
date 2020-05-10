package com.Corona.Virus.Service;

import com.Corona.Virus.Model.CoronaVirusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoronaVirusService implements InterfaceCoronaVirusService{
    public String nombreDepartamento;
    public int casosConfirmados;
    public int casosSospechosos;

    @Override
    public void Leer() {
        System.out.println("nombre dept:");;
        this.nombreDepartamento = read.next();
        System.out.println("casos confirmados:");;
        this.casosConfirmados = read.nextInt();
        System.out.println("casos sospechosos:");;
        this.casosSospechosos = read.nextInt();

    }

    @Override
    public void Mostrar() {
        System.out.println("dep" + this.nombreDepartamento +
                "CC:" + this.casosConfirmados+"cs:"+
                this.casosSospechosos);
    }
}
