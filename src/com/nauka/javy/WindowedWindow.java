package com.nauka.javy;

import javax.swing.*;

public class WindowedWindow extends JFrame {
    PasswordFrame passwordFrame = new PasswordFrame();
    public WindowedWindow() {
        super("Otwieranie okna z hasłem");
        setSize(300, 300);
        setVisible(true);
        passwordFrame.setVisible(true);
    }

    private static void setLookAndFeel() {


        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        WindowedWindow.setLookAndFeel();
        WindowedWindow windowedWindow = new WindowedWindow();
    }
}