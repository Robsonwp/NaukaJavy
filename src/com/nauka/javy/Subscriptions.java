package com.nauka.javy;

import javax.swing.*;

public class Subscriptions extends JFrame {

    String[] subs = {"Burningbird", "FreeForm Goodness", "Ideoplex", "Inssential",
    "interwingly", "Now This", "RasterWeb", "RC3", "Whole Lotta Nothing", "Workbench"};
    JList sublist = new JList(subs);

    public Subscriptions(){
        super("Subskrypcje");
        setSize(20, 335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel= new JPanel();
        JLabel subLabel = new JLabel("Subskrypcje RSS:");
        panel.add(subLabel);
        sublist.setVisibleRowCount(8);
        JScrollPane scrollPane = new JScrollPane(sublist);
        panel.add(scrollPane);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Subscriptions.setLookAndFeel();
        Subscriptions subscriptions = new Subscriptions();
    }

}
