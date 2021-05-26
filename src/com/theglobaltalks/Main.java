package com.theglobaltalks;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Application");
        JLabel label = new JLabel("Hello World !",JLabel.CENTER);
        frame.add(label);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
