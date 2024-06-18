import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import javax.swing.*;

public class RecepcionistInterface extends JFrame {

    JFrame frame;

    JLabel title;
    JLabel currentMenu;
    JLabel clientNameLabel;
    JLabel clientCPFLabel;
    JLabel output;
    JLabel checkInRoomLabel;
    JLabel checkOutRoomLabel;
    JLabel reservationCPFLabel;
    JLabel reservationCheckInLabel;
    JLabel reservationCheckOutLabel;
    JLabel reservationRoomLabel;

    JButton register;
    JButton checkin;
    JButton checkout;
    JButton reservation;
    JButton confirmRegister;
    JButton confirmCheckIn;
    JButton confirmCheckOut;
    JButton confirmReservation;

    JTextField clientNameInput;
    JTextField clientCPFInput;
    JTextField checkInRoomInput;
    JTextField checkOutRoomInput;
    JTextField reservationCPFInput;
    JTextField reservationCheckInInput;
    JTextField reservationCheckOutInput;
    JTextField reservationRoomInput;

    int windowWidth;
    int windowHeight;

    ArrayList<Client> clients;
    ArrayList<Reservation> reservations;
    ArrayList<Room> rooms;
    Receptionist receptionist;

    RecepcionistInterface(ArrayList<Client> clients, ArrayList<Reservation> reservations, ArrayList<Room> rooms,
            Receptionist receptionist) {

        windowWidth = 500;
        windowHeight = 800;

        frame = new JFrame();

        // Labels //
        title = new JLabel("Menu do Recepcionista");
        title.setBounds(180, 10, 200, 30);

        currentMenu = new JLabel("");
        currentMenu.setBounds(210, 200, 200, 100);

        clientNameLabel = new JLabel("Nome");
        clientNameLabel.setBounds(10, 230, 200, 100);

        clientCPFLabel = new JLabel("CPF");
        clientCPFLabel.setBounds(10, 280, 200, 100);

        output = new JLabel("Aguardando");
        output.setBounds(10, 580, 500, 100);

        checkInRoomLabel = new JLabel("Quarto");
        checkInRoomLabel.setBounds(10, 230, 200, 100);

        checkOutRoomLabel = new JLabel("Quarto");
        checkOutRoomLabel.setBounds(10, 230, 200, 100);

        reservationCPFLabel = new JLabel("CPF");
        reservationCPFLabel.setBounds(10, 230, 200, 100);

        reservationCheckInLabel = new JLabel("Check in");
        reservationCheckInLabel.setBounds(10, 280, 200, 100);

        reservationCheckOutLabel = new JLabel("Check Out");
        reservationCheckOutLabel.setBounds(10, 330, 200, 100);

        reservationRoomLabel = new JLabel("Quarto");
        reservationRoomLabel.setBounds(10, 380, 200, 100);

        // Buttons //
        register = new JButton("Registrar");
        register.setBounds(0, 50, 250, 80);
        register.addActionListener(e -> registerMenu());

        checkin = new JButton("Check in");
        checkin.setBounds(250, 50, 250, 80);
        checkin.addActionListener(e -> checkinMenu());

        checkout = new JButton("Check out");
        checkout.setBounds(0, 130, 250, 80);
        checkout.addActionListener(e -> checkOutMenu());

        reservation = new JButton("Reserva");
        reservation.setBounds(250, 130, 250, 80);
        reservation.addActionListener(e -> reservationMenu());

        confirmRegister = new JButton("Registrar");
        confirmRegister.setBounds(190, 700, 120, 30);
        confirmRegister.addActionListener(e -> confirmRegister());

        confirmCheckIn = new JButton("Check in");
        confirmCheckIn.setBounds(190, 700, 120, 30);
        confirmCheckIn.addActionListener(e -> confirmCheckIn());

        confirmCheckOut = new JButton("Check Out");
        confirmCheckOut.setBounds(190, 700, 120, 30);
        confirmCheckOut.addActionListener(e -> confirmCheckOut());

        confirmReservation = new JButton("Reservar");
        confirmReservation.setBounds(190, 700, 120, 30);
        confirmReservation.addActionListener(e -> confirmReservation());

        // Text Fields (input) //

        clientNameInput = new JTextField();
        clientNameInput.setBounds(10, 290, 480, 30);

        clientCPFInput = new JTextField();
        clientCPFInput.setBounds(10, 340, 480, 30);

        checkInRoomInput = new JTextField();
        checkInRoomInput.setBounds(10, 290, 480, 30);

        checkOutRoomInput = new JTextField();
        checkOutRoomInput.setBounds(10, 290, 480, 30);

        reservationCPFInput = new JTextField();
        reservationCPFInput.setBounds(10, 290, 480, 30);

        reservationCheckInInput = new JTextField();
        reservationCheckInInput.setBounds(10, 340, 480, 30);

        reservationCheckOutInput = new JTextField();
        reservationCheckOutInput.setBounds(10, 390, 480, 30);

        reservationRoomInput = new JTextField();
        reservationRoomInput.setBounds(10, 440, 480, 30);

        frame.add(title);
        frame.add(clientNameLabel);
        frame.add(confirmRegister);
        frame.add(register);
        frame.add(checkin);
        frame.add(checkout);
        frame.add(reservation);
        frame.add(currentMenu);
        frame.add(clientNameInput);
        frame.add(clientCPFLabel);
        frame.add(clientCPFInput);
        frame.add(output);
        frame.add(checkInRoomLabel);
        frame.add(checkInRoomInput);
        frame.add(confirmCheckIn);

        frame.add(checkOutRoomLabel);
        frame.add(checkOutRoomInput);
        frame.add(confirmCheckOut);

        frame.add(reservationCPFInput);
        frame.add(reservationCPFLabel);
        frame.add(reservationCheckInLabel);
        frame.add(reservationCheckInInput);
        frame.add(reservationCheckOutLabel);
        frame.add(reservationCheckOutInput);
        frame.add(reservationRoomLabel);
        frame.add(reservationRoomInput);
        frame.add(confirmReservation);

        frame.setSize(windowWidth, windowHeight);

        frame.setTitle("Menu do Recepcionista");

        frame.setLayout(null);

        frame.setVisible(true);

        makeCheckInInvisible();
        makeCheckOutInvisible();
        makeRegisterInvisible();
        makeReservationInvisible();

        this.clients = clients;
        this.reservations = reservations;
        this.receptionist = receptionist;
        this.rooms = rooms;

    }

    public void makeRegisterInvisible() {
        clientCPFLabel.setVisible(false);
        clientCPFInput.setVisible(false);
        clientNameLabel.setVisible(false);
        clientNameInput.setVisible(false);
        confirmRegister.setVisible(false);

    }

    public void makeCheckInInvisible() {
        checkInRoomLabel.setVisible(false);
        checkInRoomInput.setVisible(false);
        confirmCheckIn.setVisible(false);
    }

    public void makeCheckOutInvisible() {
        checkOutRoomLabel.setVisible(false);
        checkOutRoomInput.setVisible(false);
        confirmCheckOut.setVisible(false);
    }

    public void makeReservationInvisible() {

        reservationCPFInput.setVisible(false);
        reservationCPFLabel.setVisible(false);
        reservationCheckInInput.setVisible(false);
        reservationCheckInLabel.setVisible(false);
        reservationCheckOutInput.setVisible(false);
        reservationCheckOutLabel.setVisible(false);
        confirmReservation.setVisible(false);
        reservationRoomLabel.setVisible(false);
        reservationRoomInput.setVisible(false);
    }

    public void checkinMenu() {

        currentMenu.setText("Check in");

        checkInRoomLabel.setVisible(true);
        checkInRoomInput.setVisible(true);
        confirmCheckIn.setVisible(true);

        makeRegisterInvisible();
        makeCheckOutInvisible();
        makeReservationInvisible();

    }

    public void checkOutMenu() {

        currentMenu.setText("Check Out");

        checkOutRoomLabel.setVisible(true);
        checkOutRoomInput.setVisible(true);
        confirmCheckOut.setVisible(true);

        makeRegisterInvisible();
        makeCheckInInvisible();
        makeReservationInvisible();

    }

    public void reservationMenu() {

        currentMenu.setText("Reserva");

        reservationCPFInput.setVisible(true);
        reservationCPFLabel.setVisible(true);
        reservationCheckInInput.setVisible(true);
        reservationCheckInLabel.setVisible(true);
        reservationCheckOutInput.setVisible(true);
        reservationCheckOutLabel.setVisible(true);
        reservationRoomLabel.setVisible(true);
        reservationRoomInput.setVisible(true);
        confirmReservation.setVisible(true);

        makeRegisterInvisible();
        makeCheckInInvisible();
        makeCheckOutInvisible();

    }

    public void registerMenu() {

        currentMenu.setText("Cadastro");

        clientCPFLabel.setVisible(true);
        clientCPFInput.setVisible(true);
        clientNameLabel.setVisible(true);
        clientNameInput.setVisible(true);
        confirmRegister.setVisible(true);

        makeCheckInInvisible();
        makeCheckOutInvisible();
        makeReservationInvisible();

    }

    public void confirmRegister() {
        String name = clientNameInput.getText();
        String cpf = clientCPFInput.getText();
        boolean unique = true;

        for (Client client : clients) {
            if (Integer.valueOf(cpf) == client.getId()) {
                unique = false;
            }
        }

        if (unique) {
            clients.add(new Client(name, Integer.valueOf(cpf)));
            output.setText("Cadastrado " + name + " de CPF " + cpf);

        } else {
            output.setText("CPF já cadastrado");
        }

    }

    public void confirmCheckIn() {
        String quarto = checkInRoomInput.getText();
        boolean foundRoom = false;

        for (Reservation reservation : reservations) {
            if (reservation.getRoom().getNumber() == Integer.valueOf(quarto)) {
                foundRoom = true;
            }

        }

        if (foundRoom) {
            output.setText("Check In do quarto " + quarto + " realizado!");

        }

        else {
            output.setText("Não foi possível realizar o Check In!");
        }

    }

    public void confirmCheckOut() {
        String quarto = checkInRoomInput.getText();
        boolean foundRoom = false;

        for (Reservation reservation : reservations) {
            if (reservation.getRoom().getNumber() == Integer.valueOf(quarto)) {
                foundRoom = true;
            }

        }

        if (foundRoom) {
            output.setText("Check Out do quarto " + quarto + " realizado!");

        }

        else {
            output.setText("Não foi possível realizar o Check Out!");
        }
    }

    public void confirmReservation() {
        String CPF = reservationCPFInput.getText();
        String checkin = reservationCheckInInput.getText();
        String checkout = reservationCheckOutInput.getText();
        String room = reservationRoomInput.getText();
        Room correctRoom = null;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Date cehckinDate = format.parse(checkin);
            Date cehckoutDate = format.parse(checkout);
            int CPFInt = Integer.parseInt(CPF);
            int roomInt = Integer.parseInt(room);

            for (Room roomIndv : rooms) {
                if (roomIndv.getNumber() == roomInt) {
                    correctRoom = roomIndv;
                }
            }

            for (Client client : clients) {
                if (client.getId() == CPFInt && correctRoom != null) {
                    reservations.add(new Reservation(client, receptionist, correctRoom));
                    output.setText(
                            "Reserva de " + checkin + " a " + checkout + " do quarto " + room + " no cpf " + CPF);
                    break;
                } else {
                    output.setText("Reserva inválida - Cliente não cadastrado \n Ou Quarto inválido");
                }

            }

        } catch (Exception e) {
            output.setText("Reserva inválida");
        }

    }

    public static void main(String[] args) {
        // RecepcionistInterface interface2 = new RecepcionistInterface();
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}
