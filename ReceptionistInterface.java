import java.awt.Color;

import javax.swing.*;

public class ReceptionistInterface extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu do Recepcionista");
        JPanel panel1 = new JPanel();

        JLabel label1 = new JLabel("Recepcionista");

        JButton button1 = new JButton("Cadastro");// creating instance of JButton
        JButton button2 = new JButton("Check in");// creating instance of JButton
        JButton button3 = new JButton("Check out");// creating instance of JButton
        JButton button4 = new JButton("Reserva");// creating instance of JButton

        button1.setBounds(0, 50, 100, 40);// x axis, y axis, width, height
        button1.addActionListener(e -> System.out.println("foo"));

        button2.setBounds(100, 50, 100, 40);// x axis, y axis, width, height
        button2.addActionListener(e -> System.out.println("bar"));

        button3.setBounds(200, 50, 100, 40);// x axis, y axis, width, height
        button3.addActionListener(e -> System.out.println("foobar"));

        button4.setBounds(300, 50, 100, 40);// x axis, y axis, width, height
        button4.addActionListener(e -> System.out.println("barfoo"));

        panel1.setBackground(Color.LIGHT_GRAY);

        panel1.add(label1);
        frame.add(button1);// adding button in JFrame
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.add(panel1);

        frame.setSize(400, 500);// 400 width and 500 height
        frame.setVisible(true);// making the frame visible a

    }
}