package com.nauka.javy;

import javax.swing.*;

public class PasswordFrame extends JFrame {
    public PasswordFrame(){

        super("Podaj login i haslo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel loginLabel = new JLabel("Login:");
        JTextField textField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Hasło:");
        JPasswordField passwordField = new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(loginLabel);
        panel.add(textField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        add(panel);
        pack();
        setLookAndFeel();
        setVisible(false);

    }

    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
