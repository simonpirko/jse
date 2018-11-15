package com.example.hort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTest {


    public static void main(String[] args) {
        ActionListener nv = new TimerLister();
        Timer timer = new Timer(4000, new TimerLister(){
            int a;
            {
                a = 6;
            }

            public void ab(){
                System.out.println("Hello");
            }

            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(a);
                ab();
            }
        });
        timer.start();

        JOptionPane.showMessageDialog(null, "quit&");
        System.exit(0);
    }
}
