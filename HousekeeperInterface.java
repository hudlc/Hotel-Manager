import java.util.ArrayList;

import javax.swing.*;

public class HousekeeperInterface extends JFrame {

    JFrame frame;

    JLabel title;
    JLabel inputRoomLabel;
    JLabel inputValueLabel;
    JLabel output;

    JButton confirm;

    JTextField inputRoom;
    JTextField inputValue;

    int windowWidth;
    int windowHeight;

    ArrayList<Room> rooms;
    ArrayList<Reservation> reservations;

    HousekeeperInterface(ArrayList<Reservation> reservations) {

        windowWidth = 500;
        windowHeight = 800;

        frame = new JFrame();
        title = new JLabel("Menu na Camareira");
        inputRoomLabel = new JLabel("Quarto");
        inputValueLabel = new JLabel("Valor");
        output = new JLabel("Aguardando!");
        confirm = new JButton("Cobrar");
        inputRoom = new JTextField();
        inputValue = new JTextField();

        this.reservations = reservations;

        title.setBounds(180, 10, 200, 30);
        inputRoomLabel.setBounds(10, 45, 200, 30);
        inputRoom.setBounds(10, 70, 200, 30);
        inputValueLabel.setBounds(10, 115, 200, 30);
        inputValue.setBounds(10, 140, 200, 30);
        confirm.setBounds(10, 200, 120, 30);
        output.setBounds(10, 300, 300, 30);

        frame.add(confirm);
        frame.add(inputRoomLabel);
        frame.add(title);
        frame.add(inputRoom);
        frame.add(inputValue);
        frame.add(inputValueLabel);
        frame.add(output);

        frame.setSize(windowWidth, windowHeight);

        frame.setTitle("Menu da Camareira");

        frame.setLayout(null);

        frame.setVisible(true);

        confirm.addActionListener(e -> confirmCharge());

    }

    public void confirmCharge() {
        String roomNumber = inputRoom.getText();
        String value = inputValue.getText();

        for (Reservation reservation : reservations) {
            if (Integer.toString(reservation.getRoom().getNumber()).equals(roomNumber)) {
                output.setText("Cobrança realizada!");

            } else {
                System.out.println(reservation.getRoom().getNumber());
                System.out.println(roomNumber);
                output.setText("Erro");
            }
        }

        // output.setText("Cobrado " + value + " do quarto " + roomNumber + "!");
    }

    public static void main(String[] args) {
        // HousekeeperInterface interface1 = new HousekeeperInterface();
    }

}
