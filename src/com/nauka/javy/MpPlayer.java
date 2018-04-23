package com.nauka.javy;

import javax.swing.*;

public class MpPlayer extends JFrame {

    public MpPlayer(){
        super("Kopia interfejsu odtwarzania");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton start = new JButton("start");
        JButton stop = new JButton("stop");
        JButton previous= new JButton("previous");
        JButton next = new JButton("next");
        JPanel panel = new JPanel();
        panel.add(start);
        panel.add(stop);
        panel.add(previous);
        panel.add(next);
        add(panel);
        pack();
        setVisible(true);

    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        MpPlayer.setLookAndFeel();
        MpPlayer mpPlayer = new MpPlayer();

    }
}
