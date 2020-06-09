package com.defensa.Hito4.GUI.Panels;

import com.defensa.Hito4.GUI.Listener.ButtonListener;
import com.defensa.Hito4.GUI.util.Util;
import com.defensa.Hito4.Model.AlphabetModel2;
import com.defensa.Hito4.Service.AlphabetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

@Component
public class PanelPrincipal extends JPanel {

    @Autowired
    private AlphabetService alphabetService;

    public PanelPrincipal() {
        System.setProperty("butBackColor", "#C1ECF1");
        System.setProperty("textColor", "#0B0BF6");
        this.setPreferredSize(new Dimension(600, 190));
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(3, 0));
    }

    @PostConstruct
    public void createButtonsLetters() {
        java.util.List<AlphabetModel2> firstRow = alphabetService.getAllLettersFirst();
        String[] titleAlphabet = firstRow.get(0).getLetter().split(",");
        JPanel panelQ_P = this.createPanelButton(titleAlphabet);
        this.add(panelQ_P);

        java.util.List<AlphabetModel2> secondRow = alphabetService.getAllLettersSecond();
        String[] titleAlphabet1 = secondRow.get(0).getLetter().split(",");
        JPanel panelA_L = this.createPanelButton(titleAlphabet1);
        this.add(panelA_L);

        List<AlphabetModel2> threeRow = alphabetService.getAllLettersThree();
        String[] titleAlphabet2 = threeRow.get(0).getLetter().split(",");
        JPanel panelZ_M = this.createPanelButton(titleAlphabet2);
        this.add(panelZ_M);
    }

    public JPanel createPanelButton(String[] titleAlphabet){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        ButtonListener listener = new ButtonListener();

        for(String title : titleAlphabet){
            JButton button = new JButton(title);
            button.setPreferredSize(new Dimension(55, 40));
            button.addActionListener(listener);
            button.setBackground(Color.getColor("butBackColor"));
            button.setForeground(Color.getColor("textColor"));
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setFont(Util.FONT_TEXT);
            mainPanel.add(button);
        }
        return mainPanel;
    }





}
