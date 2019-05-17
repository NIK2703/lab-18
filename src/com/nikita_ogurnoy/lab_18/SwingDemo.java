package com.nikita_ogurnoy.lab_18;

import javax.swing.*;

public class SwingDemo {

    SwingDemo()
    {
        JFrame jfr = new JFrame("Окно");
        jfr.setSize(480, 320);

        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Hello World!");

        jfr.add(jlab);

        jfr.setVisible(true);

    }

}
