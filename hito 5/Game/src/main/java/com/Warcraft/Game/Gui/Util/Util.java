package com.Warcraft.Game.Gui.Util;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

@Component
public class Util {
    public static final ImageIcon Wow_backgraund = new ImageIcon(getResourcePath("Images/WoW.webp"));
    //    public static final ImageIcon FAILED_IMAGE = new ImageIcon(getResourcePath("Images/failed.jpg"));
    public static final Font FONT_TEXT_Title = new Font("Arial",Font.BOLD,28);
    public static final Font FONT_TEXT = new Font("Arial",Font.BOLD,15);

    private static URL getResourcePath(String nameImage) {
        return Util.class.getClassLoader().getResource(nameImage);
    }
    public Util(){}
}
