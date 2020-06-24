package com.prograiii2020.swing.Model;

import javax.persistence.*;

@Entity

@Table (name = "button")
public class ButtonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name= "title", length = 50, nullable = false)
    private String titleButton;

    public ButtonModel(){

    }

    public ButtonModel(String titleButton){
        this.titleButton = titleButton;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleButton() {
        return titleButton;
    }

    public void setTitleButton(String titleButton) {
        this.titleButton = titleButton;
    }
}
