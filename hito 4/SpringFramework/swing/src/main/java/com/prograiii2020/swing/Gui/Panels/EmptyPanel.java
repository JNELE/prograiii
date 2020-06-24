package com.prograiii2020.swing.Gui.Panels;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class EmptyPanel extends JPanel {
    public EmptyPanel() {
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(2, 1));
    }

}
