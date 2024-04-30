import java.awt.Color;

import javax.swing.*;

public class ManagerInterface extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu do Recepcionista");
        JPanel panel1 = new JPanel();

        JLabel label1 = new JLabel("Recepcionista");

        JButton button1 = new JButton("Cadastro");// creating instance of JButton
        JButton button2 = new JButton("Check in");// creating instance of JButton
        JButton button3 = new JButton("Check out");// creating instance of JButton
        JButton button4 = new JButton("Reserva");// creating instance of JButton
        JButton button5 = new JButton("Cadastro Funcionário");// creating instance of JButton
        JButton button6 = new JButton("Alterar Cobrança");// creating instance of JButton

        JLabel output = new JLabel("Aguardando!");

        button1.setBounds(0, 50, 150, 40);// x axis, y axis, width, height
        button1.addActionListener(e -> output.setText("Cadstro realizado!"));

        button2.setBounds(150, 50, 150, 40);// x axis, y axis, width, height
        button2.addActionListener(e -> output.setText("Check in Realizado!"));

        button3.setBounds(300, 50, 150, 40);// x axis, y axis, width, height
        button3.addActionListener(e -> output.setText("Check out Realizado!"));

        button4.setBounds(450, 50, 150, 40);// x axis, y axis, width, height
        button4.addActionListener(e -> output.setText("Reserva realizada!"));

        button5.setBounds(0, 100, 300, 40);// x axis, y axis, width, height
        button5.addActionListener(e -> output.setText("Funcionario Cadastrado"));

        button6.setBounds(300, 100, 300, 40);// x axis, y axis, width, height
        button6.addActionListener(e -> output.setText("Cobrança Alterada"));

        panel1.setBackground(Color.LIGHT_GRAY);

        panel1.add(label1);
        frame.add(button1);// adding button in JFrame
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.add(panel1);

        frame.add(output);

        frame.setSize(600, 500);// 400 width and 500 height
        frame.setVisible(true);// making the frame visible a

    }
}