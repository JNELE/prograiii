package com.prograiii2020.swing.Service;

import com.prograiii2020.swing.Model.ButtonModel;

import java.util.List;

public interface ButtonServiceInterface {
    public void saveData();
    public String getRow();
    public List<ButtonModel> getAllTitleButton();
}
