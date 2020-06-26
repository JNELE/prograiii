package com.Warcraft.Game.Model;

import javax.persistence.*;

@Entity
@Table(name = "Muertos_Vivientes")
public class MuertoVModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "Tipo", length = 100, nullable = false)
    private String tipo;

    @Column(name = "Daño", length = 100, nullable = false)
    private Integer danio;

    @Column(name = "Salud", length = 100, nullable = false)
    private Integer salud;

    @Column(name = "Armadura", length = 100, nullable = false)
    private Integer armadura;

    @Column(name = "Comida", length = 100, nullable = false)
    private Integer comida;

    public MuertoVModel(){

    }
    public MuertoVModel(String nombre,String tipo,Integer danio,Integer salud,Integer armadura,Integer comida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.danio = danio;
        this.salud = salud;
        this.armadura = armadura;
        this.comida = comida;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getDanio() {
        return danio;
    }

    public void setDanio(Integer danio) {
        this.danio = danio;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Integer getArmadura() {
        return armadura;
    }

    public void setArmadura(Integer armadura) {
        this.armadura = armadura;
    }

    public Integer getComida() {
        return comida;
    }

    public void setComida(Integer comida) {
        this.comida = comida;
    }


}
