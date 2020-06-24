package com.defensa.Hito4.Service;

import com.defensa.Hito4.Model.AlphabetModel2;

import java.util.List;

public interface AlphabetServiceInterface {
    public void saveData();
    public List<AlphabetModel2> getAllLettersFirst();
    public List<AlphabetModel2> getAllLettersSecond();
    public List<AlphabetModel2> getAllLettersThree();
}