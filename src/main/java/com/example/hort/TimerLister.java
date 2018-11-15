package com.example.hort;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerLister implements ActionListener {

    private int abc = 5;
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Beep" + abc);
        Toolkit.getDefaultToolkit().beep();
    }
}
