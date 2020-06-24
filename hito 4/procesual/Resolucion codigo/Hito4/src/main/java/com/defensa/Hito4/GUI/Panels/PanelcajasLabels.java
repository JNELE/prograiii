/*package com.defensa.Hito4.GUI.Panels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class PanelcajasLabels extends JPanel {
    public PanelcajasLabels(){
        this.setPreferredSize(new Dimension(900, 100));
        //this.setBounds(50, 500, 900, 100);
        this.setLayout(new GridLayout(1, 0));
    }
    @PostConstruct
    public void createButtonsLabel() {
        JPanel caja1 = this.createTextBox();
        this.add(caja1);
    }

    public JPanel createTextBox()
    {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("WORD:");
        label.setPreferredSize(new Dimension(50, 40));

        JTextField txtIVA = new JTextField();
        txtIVA.setPreferredSize(new Dimension(100, 30));

        JLabel label2 = new JLabel("LANGUAGE:");
        label2.setPreferredSize(new Dimension(75, 40));

        JTextField txtIVA2 = new JTextField();
        txtIVA2.setPreferredSize(new Dimension(100, 30));

        JLabel label3 = new JLabel("RESULT:");
        label3.setPreferredSize(new Dimension(60, 40));

        JTextField txtIVA3 = new JTextField();
        txtIVA3.setPreferredSize(new Dimension(100, 30));
        mainPanel.add(label);
        mainPanel.add(txtIVA);
        mainPanel.add(label2);
        mainPanel.add(txtIVA2);
        mainPanel.add(label3);
        mainPanel.add(txtIVA3);

        return mainPanel;
    }

}*/
