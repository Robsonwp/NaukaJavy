package com.nauka.javy;

import javax.swing.*;

public class Authenticator extends JFrame {

    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Anuluj");
    JScrollPane scroll = new JScrollPane(comments,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    public Authenticator(){
        super("informacje o koncie");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Użytkownik: ");
        JLabel passwordLabel = new JLabel("Hasło: ");
        JLabel commentsLabel = new JLabel("Komentarz: ");
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(commentsLabel);
        panel.add(scroll);
        panel.add(ok);
        panel.add(cancel);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        Authenticator.setLookAndFeel();
        Authenticator authenticator = new Authenticator();
    }

}
