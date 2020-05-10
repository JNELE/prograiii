package com.COVID19.procesualHito3.VirusModel;

import javax.persistence.*;


@Entity
@Table(name = "corona_virus")
public class CasosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idcoronavirus;
    
    @Column(name = "nombredep", length = 50, nullable = false)
    private String nombredep;

    @Column(name = "casoscontagiados")
    private int casoscontagiados;

    @Column(name = "casossospechosos")
    private int casossospechosos;

    @Column(name = "casosrecuperados")
    private int casosrecuperados;

    public Integer getIdcoronavirus() {
        return idcoronavirus;
    }

    public void setIdcoronavirus(Integer idcoronavirus) {
        this.idcoronavirus = idcoronavirus;
    }

    public String getNombredep() {
        return nombredep;
    }

    public void setNombresdep(String nombresdep) {
        this.nombredep = nombresdep;
    }

    public int getCasoscontagiados() {
        return casoscontagiados;
    }

    public void setCasoscontagiados(int casoscontagiados) {
        this.casoscontagiados = casoscontagiados;
    }

    public int getCasossospechosos() {
        return casossospechosos;
    }

    public void setCasossospechosos(int casossospechosos) {
        this.casossospechosos = casossospechosos;
    }

    public int getCasosrecuperados() {
        return casosrecuperados;
    }

    public void setCasosrecuperados(int casosrecuperados) {
        this.casosrecuperados = casosrecuperados;
    }
}
