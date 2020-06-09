package com.defensa.Hito4.GUI.Panels;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

@Component
public class Panel2buttons  extends JPanel {

    public Panel2buttons(){
        System.setProperty("butBackColor", "#C1ECF1");
        System.setProperty("textColor", "#0B0BF6");

        this.setPreferredSize(new Dimension(400, 190));
        this.setLayout(new GridLayout(1, 0));
    }
    @PostConstruct
    public void create2Buttons() {
        JPanel caja2 = this.create2buttons();
        this.add(caja2);
    }
    public JPanel create2buttons()
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        JButton button = new JButton("TRANSLATE");
        button.setPreferredSize(new Dimension(150, 50));
        button.setBackground(Color.getColor("butBackColor"));
        button.setForeground(Color.getColor("textColor"));


        JButton button2 = new JButton("CLEAN");
        button2.setPreferredSize(new Dimension(100, 50));
        button2.setBackground(Color.gray);
        button2.setForeground(Color.getColor("textColor"));

        mainPanel.add(button);
        mainPanel.add(button2);
        return mainPanel;

    }

}
