package com.defensa.Hito4.GUI.Frame;

import com.defensa.Hito4.GUI.Panels.EmptyPanel;
import com.defensa.Hito4.GUI.Panels.Panel2buttons;
import com.defensa.Hito4.GUI.Panels.PanelPrincipal;
import com.defensa.Hito4.GUI.Panels.PanelcajasLabels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {
//    @Autowired
//    private EmptyPanel emptyPanel;
    @Autowired
    private PanelPrincipal panelPrincipal;
    @Autowired
    private PanelcajasLabels panelcajasLabels;
    @Autowired
    private Panel2buttons panel2buttons;

    public MainFrame() {
        this.setTitle("PROGRA III 2020");
        this.setBounds(300, 200, 800, 500);
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(1, 0));
        //this.setResizable(false);

    }

    @PostConstruct
    public void createPanelsMainFrame() {
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());

        addPanels(container);

        this.add(container);
        this.setVisible(true);
    }

    public void addPanels(JPanel container) {
        container.add(panelPrincipal);
        container.add(panelcajasLabels);
        container.add(panel2buttons);
        //container.add(emptyPanel);

    }
}