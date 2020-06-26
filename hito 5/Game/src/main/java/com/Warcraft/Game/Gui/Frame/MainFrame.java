package com.Warcraft.Game.Gui.Frame;

import com.Warcraft.Game.Gui.Panels.Warcraft2;
import com.Warcraft.Game.Gui.Panels.WarcraftPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

    @Autowired
    private WarcraftPanel warcraftPanel;

    @Autowired
    private Warcraft2 warcraft2;


    public  MainFrame(){

        this.setTitle("Warcraft");
        this.setBounds(300, 200, 990,600);
        //System.setProperty("panelcolo","#17b978");
        this.setBackground(Color.green);
        this.setLayout(new GridLayout(2,0));
        this.setResizable(false);


    }
    @PostConstruct
    public void crateMainFrame(){
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());

        addPanels(container);

        this.add(container);
        this.setVisible(true);
    }
    public void addPanels(JPanel container){
        container.add(warcraftPanel);
       container.add(warcraft2);
//        container.add(emptyPanel);
    }
}
