package GUI;

import javax.swing.*;

public class TEST {


    private JPanel Panel_TEST;
    private JLabel Name;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TEST");
        frame.setContentPane(new TEST().Panel_TEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200 , 600);
        frame.setVisible(true);
    }
}
