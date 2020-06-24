package com.prograiii2020.swing.Model;

import javax.persistence.*;

@Entity
@Table(name = "Alphabet")
public class AlphabetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "letter", length = 200, nullable = false)
    private String letter;

    @Column(name = "typer", length = 10, nullable = false)
    private String typer;

    public AlphabetModel() {

    }

    public AlphabetModel(String letter, String typer) {
        this.letter = letter;
        this.typer = typer;
    }

    public String getTyper() {
        return typer;
    }

    public void setTyper(String typer) {
        this.typer = typer;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
