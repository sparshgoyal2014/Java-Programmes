package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import java.sql.Date;

public class Window extends Frame {
    public Window(String title)  {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sanSarifLarge = new Font("sanSerif", Font.BOLD, 18);
        Font sansarifSmall = new Font("sansarrif", Font.BOLD, 12);
        g.setFont(sanSarifLarge);
        g.drawString("I Am spartsh goyal", 60,60);
        g.setFont(sansarifSmall);
        g.drawString("I Love Java", 60,120);
    }
}
