package com.Warcraft.Game.Gui.Panels;

import com.Warcraft.Game.Gui.Util.Util;
import com.Warcraft.Game.Model.ElfoModel;
import com.Warcraft.Game.Model.HumanoModel;
import com.Warcraft.Game.Model.MuertoVModel;
import com.Warcraft.Game.Model.OrcoModel;
import com.Warcraft.Game.Service.ElfoService;
import com.Warcraft.Game.Service.HumanService;
import com.Warcraft.Game.Service.MuertosVService;
import com.Warcraft.Game.Service.OrcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

@Component
public class Warcraft2 extends JPanel {
    @Autowired
    private OrcoService orcoService;
    @Autowired
    private MuertosVService muertosVService;
    @Autowired
    private HumanService humanService;
    @Autowired
    private ElfoService elfoService;

    JLabel label_Title = new JLabel("World of warcraft");//1

    JComboBox combo_Raza = new JComboBox();//2

    JComboBox combo_Unidades = new JComboBox();
    JTextField txt_cantidad = new JTextField();
    JTextField txt_comida = new JTextField();
    JButton buttonCComida = new JButton();//3

    Object datosUnidadOrcos[] = new Object[4];

    JList datosUnidadOrco=new JList(datosUnidadOrcos);

    JLabel label_comida = new JLabel();

    JLabel Label_Unidades = new JLabel();

    JLabel label3 = new JLabel();
    JTextField result = new JTextField();


    public Warcraft2(){
        System.setProperty("butBackColor","#000000");
        System.setProperty("panelcolo","#616f39");
        System.setProperty("textColor","#0B0BF6");
        this.setPreferredSize(new Dimension(500,400));
        this.setLayout(new GridLayout(3,0));
    }

    @PostConstruct
    public void createButtons(){
        JPanel label = this.createPanelTituloLabel();
        this.add(label);
        JPanel LabelRazas = this.createLabel();
        this.add(LabelRazas);
        JPanel combo = this.createPanelCombo();
        this.add(combo);
        JPanel listaUnidades = this.datosUnidad();
        this.add(listaUnidades);
    }

    public JPanel createPanelTituloLabel(){
        System.setProperty("textColor","#0B0BF6");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        label_Title.setPreferredSize(new Dimension(250,30));
        label_Title.setFont(Util.FONT_TEXT_Title);

        mainPanel.add(label_Title);

        return mainPanel;
    }

    public JPanel createLabel(){
        System.setProperty("textColor","#0B0BF6");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        JLabel Label_Razas = new JLabel("Razas");
        mainPanel.add(Label_Razas);
        JLabel Label_Unidades = new JLabel("Unidades");
        mainPanel.add(Label_Unidades);

        return mainPanel;
    }

    public JPanel createPanelCombo(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        combo_Raza.addItem("humanos");
        combo_Raza.addItem("Orcos");
        combo_Raza.addItem("muertos_vivientes");
        combo_Raza.addItem("elfo_de_la_noche");
        mainPanel.add(combo_Raza);
        txt_cantidad.setPreferredSize(new Dimension(50,30));
        txt_cantidad.setFont(Util.FONT_TEXT);
        txt_comida.setPreferredSize(new Dimension(50,30));
        txt_comida.setFont(Util.FONT_TEXT);


        buttonCComida.setPreferredSize(new Dimension(100,30));
        buttonCComida.setFont(Util.FONT_TEXT);
        buttonCComida.setText("Calcular");


        combo_Raza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = (String) combo_Raza.getSelectedItem();

                combo_Unidades.removeAllItems();
                switch (nombre) {
                    case "Orcos":
                        java.util.List<OrcoModel> allnombresOrcos = orcoService.obtenerUnidadesOrcos();
                        allnombresOrcos.forEach(NombreOrcoModel -> {
                            combo_Unidades.addItem(NombreOrcoModel.getNombre());

                            combo_Unidades.setPreferredSize(new Dimension(150, 40));

                        });
                        break;
                    case "muertos_vivientes":
                        java.util.List<MuertoVModel> allnombresMuertos = muertosVService.obtenerUnidadesMuertos();
                        allnombresMuertos.forEach(NombreMuertoModel -> {

                            combo_Unidades.addItem(NombreMuertoModel.getNombre());
                            combo_Unidades.setPreferredSize(new Dimension(150, 40));

                        });
                        break;
                    case "humanos":
                        java.util.List<HumanoModel> allnombreshumanos = humanService.obtenerUnidadesHumanos();
                        allnombreshumanos.forEach(NombreMuertoModel -> {

                            combo_Unidades.addItem(NombreMuertoModel.getNombre());
                            combo_Unidades.setPreferredSize(new Dimension(150, 40));


                        });
                        break;
                    case "elfo_de_la_noche":
                        List<ElfoModel> allnombresElfos = elfoService.obtenerUnidadesElfo();
                        allnombresElfos.forEach(NombreMuertoModel -> {

                            combo_Unidades.addItem(NombreMuertoModel.getNombre());
                            combo_Unidades.setPreferredSize(new Dimension(150, 40));


                        });
                        break;
                }
            }
        });

        //String nombre2 = (String) combo_Unidades.getSelectedItem();
        String prueba;
        prueba = String.valueOf((combo_Unidades.getSelectedItem()));

        txt_comida.setText("100");


        buttonCComida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button1 = (JButton) actionEvent.getSource();
                String nombre = (String) combo_Raza.getSelectedItem();
                switch (nombre) {
                    case "Orcos":
                        combo_Raza.setVisible(false);
                        if (Integer.valueOf(txt_comida.getText()) >= 0) {

                            int comida = Integer.valueOf(txt_comida.getText());
                            int aux, aux2, aux3;

                            Integer comidatotal = orcoService.comida(String.valueOf((combo_Unidades.getSelectedItem())), Integer.valueOf(txt_cantidad.getText()));
                            aux3 = comida-comidatotal;
                            if(aux3>=0) {
                                if (comida != 100) {

                                    aux = comida - comidatotal;
                                    txt_comida.setText(String.valueOf(aux));
                                } else {
                                    aux2 = Integer.valueOf(txt_comida.getText()) - comidatotal;
                                    txt_comida.setText(String.valueOf(aux2));
                                }
                            }
                            else{
                                //buttonCComida.setVisible(false);
                                JOptionPane.showMessageDialog(null,"Comida insufuciente para la unidad seleccione otro monto");
                            }
                        }
                        break;
                    case "muertos_vivientes":
                        combo_Raza.setVisible(false);
                        if (Integer.valueOf(txt_comida.getText()) >= 0) {

                            int comida = Integer.valueOf(txt_comida.getText());
                            int aux, aux2, aux3;

                            Integer comidatotal = muertosVService.comida(String.valueOf((combo_Unidades.getSelectedItem())), Integer.valueOf(txt_cantidad.getText()));
                            aux3 = comida-comidatotal;
                            if(aux3>=0) {
                                if (comida != 100) {

                                    aux = comida - comidatotal;
                                    txt_comida.setText(String.valueOf(aux));
                                } else {
                                    aux2 = Integer.valueOf(txt_comida.getText()) - comidatotal;
                                    txt_comida.setText(String.valueOf(aux2));
                                }
                            }
                            else{
                                //buttonCComida.setVisible(false);
                                JOptionPane.showMessageDialog(null,"Comida insufuciente para la unidad seleccione otro monto");
                            }
                        }

                        break;
                    case "humanos":
                        combo_Raza.setVisible(false);
                        if (Integer.valueOf(txt_comida.getText()) >= 0) {

                            int comida = Integer.valueOf(txt_comida.getText());
                            int aux, aux2, aux3;

                            Integer comidatotal = humanService.comida(String.valueOf((combo_Unidades.getSelectedItem())), Integer.valueOf(txt_cantidad.getText()));
                            aux3 = comida-comidatotal;
                            if(aux3>=0) {
                                if (comida != 100) {

                                    aux = comida - comidatotal;
                                    txt_comida.setText(String.valueOf(aux));
                                } else {
                                    aux2 = Integer.valueOf(txt_comida.getText()) - comidatotal;
                                    txt_comida.setText(String.valueOf(aux2));
                                }
                            }
                            else{
                                //buttonCComida.setVisible(false);
                                JOptionPane.showMessageDialog(null,"Comida insufuciente para la unidad seleccione otro monto");
                            }
                        }

                        break;
                    case "elfo_de_la_noche":
                        combo_Raza.setVisible(false);
                        if (Integer.valueOf(txt_comida.getText()) >= 0) {

                            int comida = Integer.valueOf(txt_comida.getText());
                            int aux, aux2, aux3;

                            Integer comidatotal = elfoService.comida(String.valueOf((combo_Unidades.getSelectedItem())), Integer.valueOf(txt_cantidad.getText()));
                            aux3 = comida-comidatotal;
                            if(aux3>=0) {
                                if (comida != 100) {

                                    aux = comida - comidatotal;
                                    txt_comida.setText(String.valueOf(aux));
                                } else {
                                    aux2 = Integer.valueOf(txt_comida.getText()) - comidatotal;
                                    txt_comida.setText(String.valueOf(aux2));
                                }
                            }
                            else{
                                //buttonCComida.setVisible(false);
                                JOptionPane.showMessageDialog(null,"Comida insufuciente para la unidad seleccione otro monto");
                            }
                        }

                        break;
                }

            }
        });

        mainPanel.add(combo_Unidades);
        mainPanel.add(txt_cantidad);
        mainPanel.add(txt_comida);
        mainPanel.add(buttonCComida);

        return mainPanel;
    }

    public JPanel datosUnidad(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());



        datosUnidadOrco.setSize(800,800);
        mainPanel.add(datosUnidadOrco);


        combo_Unidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = (String) combo_Unidades.getSelectedItem();
                String raza = (String) combo_Raza.getSelectedItem();

                datosUnidadOrco.removeAll();
                switch (raza) {
                    case "humanos":
                        datosUnidadOrcos[0] = "Salud :" + humanService.datosUnidadsalud(nombre);
                        datosUnidadOrcos[1] = "Armadura :" + humanService.datosUnidadArmadura(nombre);
                        datosUnidadOrcos[2] = "daño :" + humanService.datosUnidaddanio(nombre);
                        datosUnidadOrcos[3] = "Clase :" + humanService.datosUnidadtipo(nombre);
                        mainPanel.add(datosUnidadOrco);

                        break;
                    case "Orcos":

                        datosUnidadOrcos[0] = "Salud :" + orcoService.datosUnidadsalud(nombre);
                        datosUnidadOrcos[1] = "Armadura :" + orcoService.datosUnidadArmadura(nombre);
                        datosUnidadOrcos[2] = "daño :" + orcoService.datosUnidaddanio(nombre);
                        datosUnidadOrcos[3] = "Clase :" + orcoService.datosUnidadtipo(nombre);
                        mainPanel.add(datosUnidadOrco);

                        break;
                    case "muertos_vivientes":
                        datosUnidadOrcos[0] = "Salud :" + muertosVService.datosUnidadsalud(nombre);
                        datosUnidadOrcos[1] = "Armadura :" + muertosVService.datosUnidadArmadura(nombre);
                        datosUnidadOrcos[2] = "daño :" + muertosVService.datosUnidaddanio(nombre);
                        datosUnidadOrcos[3] = "Clase :" + muertosVService.datosUnidadtipo(nombre);
                        mainPanel.add(datosUnidadOrco);
                        break;
                    case "elfo_de_la_noche":
                        datosUnidadOrcos[0] = "Salud :" + elfoService.datosUnidadsalud(nombre);
                        datosUnidadOrcos[1] = "Armadura :" + elfoService.datosUnidadArmadura(nombre);
                        datosUnidadOrcos[2] = "daño :" + elfoService.datosUnidaddanio(nombre);
                        datosUnidadOrcos[3] = "Clase :" + elfoService.datosUnidadtipo(nombre);
                        mainPanel.add(datosUnidadOrco);
                        break;
                    case "":
                        JOptionPane.showMessageDialog(null,"Cargando");
                        break;
                }
            }
        });
        mainPanel.add(datosUnidadOrco);
        return mainPanel;
    }
}
