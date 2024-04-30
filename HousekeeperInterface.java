import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class HousekeeperInterface extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu da Camareira");
        JPanel panel1 = new JPanel();

        JLabel label1 = new JLabel("Camareira");

        JButton button1 = new JButton("Limpeza");// creating instance of JButton

        JLabel output = new JLabel("Aguardando!");

        button1.setBounds(0, 50, 150, 40);// x axis, y axis, width, height
        button1.addActionListener(e -> output.setText("Limpeza Cadastrada!"));

        panel1.setBackground(Color.LIGHT_GRAY);

        panel1.add(label1);
        frame.add(button1);// adding button in JFrame

        frame.add(panel1);

        frame.add(output);

        frame.setSize(600, 500);// 400 width and 500 height
        frame.setVisible(true);// making the frame visible a

    }
}