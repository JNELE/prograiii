package com.Warcraft.Game.Gui.Listener;

import com.Warcraft.Game.Gui.Panels.WarcraftPanel;
import com.Warcraft.Game.Model.MuertoVModel;
import com.Warcraft.Game.Model.OrcoModel;
import com.Warcraft.Game.Service.OrcoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CombounidadesListener implements ActionListener {

    @Autowired
    private OrcoService orcoService;
    @Autowired
    private WarcraftPanel warcraftPanel;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
