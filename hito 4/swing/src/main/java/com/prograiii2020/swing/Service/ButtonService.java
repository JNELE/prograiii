package com.prograiii2020.swing.Service;

import com.prograiii2020.swing.Model.ButtonModel;
import com.prograiii2020.swing.Repository.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService implements ButtonServiceInterface {
    private static final String TITLE_BUTTONS = "SAVE;DELETE;CANCEL;LOGIN;LOGOUT;UPDATE";
    @Autowired
    private ButtonRepository buttonRepository;

    @Override
    public void saveData() {
        if(buttonRepository.count() == 0) {
            String titleButtons[] = TITLE_BUTTONS.split(";");

            for(String titleButton : titleButtons){
                buttonRepository.save(new ButtonModel(titleButton));
            }

        }

    }

    @Override
    public String getRow() {
        ButtonModel bModel = buttonRepository.getTitleButtons();
        return bModel.getTitleButton();

    }

    @Override
    public List<ButtonModel> getAllTitleButton() {
        //List<ButtonModel> allTitles = new ArrayList<ButtonModel>();
        //buttonRepo.findAll().forEach(allTitles::add);
        //return allTitles;
        return new ArrayList<ButtonModel>(buttonRepository.findAll());
    }
}
