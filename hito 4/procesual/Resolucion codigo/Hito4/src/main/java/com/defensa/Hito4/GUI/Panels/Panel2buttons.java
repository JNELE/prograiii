package com.defensa.Hito4.GUI.Panels;

import com.defensa.Hito4.Service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class Panel2buttons  extends JPanel{

    @Autowired
   // private PanelcajasLabels panelcajasLabels;
    private DictionaryService dictionaryService;

    public Panel2buttons(){
        System.setProperty("butBackColor", "#C1ECF1");
        System.setProperty("textColor", "#0B0BF6");

        this.setPreferredSize(new Dimension(600, 1000));
        this.setLayout(new GridLayout(2, 0));
    }

    @PostConstruct
    public void create2Buttons() {
        JPanel caja2 = this.create2buttons();
        this.add(caja2);
        //***************
       /* JPanel caja1 = this.create2buttons();
        this.add(caja1);*/
    }
    public JPanel create2buttons()
    {



        //////////////////
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

        JButton button = new JButton("TRANSLATE");
        button.setPreferredSize(new Dimension(150, 50));
        button.setBackground(Color.getColor("butBackColor"));
        button.setForeground(Color.getColor("textColor"));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button = (JButton) actionEvent.getSource();
                String w = txtIVA.getText();
                String l = txtIVA2.getText();

                String t = dictionaryService.traducir(w,l);

                txtIVA3.setText(t);

            }
        });


        JButton button2 = new JButton("CLEAN");
        button2.setPreferredSize(new Dimension(100, 50));
        button2.setBackground(Color.gray);
        button2.setForeground(Color.getColor("textColor"));

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button2 = (JButton) actionEvent.getSource();
                String clear = "";
                txtIVA.setText(clear);
                txtIVA2.setText(clear);
                txtIVA3.setText(clear);
            }
        });


        mainPanel.add(label);
        mainPanel.add(txtIVA);
        mainPanel.add(label2);
        mainPanel.add(txtIVA2);
        mainPanel.add(label3);
        mainPanel.add(txtIVA3);
        mainPanel.add(button);
        mainPanel.add(button2);
        return mainPanel;
    }
}
