package com.nauka.javy;


import javax.swing.*;


public class Okienko extends JFrame {

    public Okienko(){

        setSize(400, 400);
        JPanel panel = new JPanel();
        JButton test = new JButton("test");
        panel.add(test);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){

        Okienko okienko = new Okienko();

    }
}
