package com.theglobaltalks;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Dman\\Desktop\\JTest\\op.text"));
            bw.write("Hello");
            bw.write("Ram. ");
            bw.write("How r u!");
            bw.close();
        }catch (Exception ex){
            return;
        }
        Person ob1 = new Person();
        JFrame frame = new JFrame("My Application");
        JLabel label = new JLabel(ob1.repeat()+" "+ob1.value()+"\\uD83D\\uDE0E",JLabel.CENTER);
        frame.add(label);
        frame.setSize(400,400);
        frame.setVisible(true);


    }
}
