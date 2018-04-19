package com.nauka.javy.com.icon.frame;

import javax.swing.*;

public class IconFrame extends JFrame {

    JButton load, save, subscribe, unsubscribe;

    public IconFrame(){
        super("Ramka z ikonami");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        //tworzenie ikon
        ImageIcon loadIcon = new ImageIcon(
                "C:\\Users\\OEM\\IdeaProjects\\NaukaJavy\\src\\com\\nauka\\javy\\com\\icon\\frame\\load.gif"
        );
        ImageIcon saveIcon = new ImageIcon(
                "C:\\Users\\OEM\\IdeaProjects\\NaukaJavy\\src\\com\\nauka\\javy\\com\\icon\\frame\\save.gif"
        );
        ImageIcon subscribeIcon = new ImageIcon(
                "C:\\Users\\OEM\\IdeaProjects\\NaukaJavy\\src\\com\\nauka\\javy\\com\\icon\\frame\\subscribe.gif"
        );
        ImageIcon unsubscribeIcon = new ImageIcon(
                "C:\\Users\\OEM\\IdeaProjects\\NaukaJavy\\src\\com\\nauka\\javy\\com\\icon\\frame\\unsubscribe.gif"
        );

        //tworzenie przyciskow
        load = new JButton("Wczytaj", loadIcon);
        save = new JButton("Zapisz", saveIcon);
        subscribe = new JButton("Zarejestruj", subscribeIcon);
        unsubscribe = new JButton("Wyrejestruj", unsubscribeIcon);

        //dodawanie przycisków do panelu
        panel.add(load);
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);

        //dodawanie panelu do ramki
        add(panel);
        pack();
        setVisible(true);

    }

    public static void main(String[] args){
        IconFrame iconFrame = new IconFrame();
    }

}
