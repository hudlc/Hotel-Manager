import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import javax.swing.*;

public class ManagerInterface extends JFrame {

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
    JLabel employeeRegisterNameLabel;
    JLabel employeeRegisterCPFLabel;
    JLabel employeeRegisterOcupationLabel;
    JLabel changeChargeRoomLabel;
    JLabel changeChargeValueLabel;

    JButton register;
    JButton checkin;
    JButton checkout;
    JButton reservation;
    JButton confirmRegister;
    JButton confirmCheckIn;
    JButton confirmCheckOut;
    JButton confirmReservation;
    JButton registerEmployee;
    JButton changeCharge;
    JButton confirmRegisterEmployee;
    JButton confirmChangeChargeRoom;

    JTextField clientNameInput;
    JTextField clientCPFInput;
    JTextField checkInRoomInput;
    JTextField checkOutRoomInput;
    JTextField reservationCPFInput;
    JTextField reservationCheckInInput;
    JTextField reservationCheckOutInput;
    JTextField reservationRoomInput;
    JTextField employeeRegisterNameInput;
    JTextField employeeRegisterCPFInput;
    JTextField changeChargeRoomInput;
    JTextField changeChargeValueInput;

    JComboBox<String> occupationsComboBoxInput;

    int windowWidth;
    int windowHeight;

    ArrayList<Client> clients;
    ArrayList<Reservation> reservations;
    ArrayList<Room> rooms;
    ArrayList<Housekeeper> housekeepers;
    ArrayList<Receptionist> receptionists;
    Receptionist receptionist;

    ManagerInterface(ArrayList<Client> clients, ArrayList<Reservation> reservations, ArrayList<Room> rooms,
            Receptionist receptionist, ArrayList<Receptionist> receptionists, ArrayList<Housekeeper> housekeepers) {

        windowWidth = 500;
        windowHeight = 800;

        frame = new JFrame();

        // Labels //
        title = new JLabel("Menu do Gerente");
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

        employeeRegisterNameLabel = new JLabel("Nome");
        employeeRegisterNameLabel.setBounds(10, 230, 200, 100);

        employeeRegisterCPFLabel = new JLabel("CPF");
        employeeRegisterCPFLabel.setBounds(10, 280, 200, 100);

        employeeRegisterOcupationLabel = new JLabel("Ocupação");
        employeeRegisterOcupationLabel.setBounds(10, 330, 200, 100);

        changeChargeRoomLabel = new JLabel("Quarto");
        changeChargeRoomLabel.setBounds(10, 230, 200, 100);

        changeChargeValueLabel = new JLabel("Valor");
        changeChargeValueLabel.setBounds(10, 280, 200, 100);

        // Buttons //
        register = new JButton("Registrar Cliente");
        register.setBounds(0, 50, 250, 40);
        register.addActionListener(e -> registerMenu());

        checkin = new JButton("Check in");
        checkin.setBounds(250, 50, 250, 40);
        checkin.addActionListener(e -> checkinMenu());

        checkout = new JButton("Check out");
        checkout.setBounds(0, 90, 250, 40);
        checkout.addActionListener(e -> checkOutMenu());

        reservation = new JButton("Reserva");
        reservation.setBounds(250, 90, 250, 40);
        reservation.addActionListener(e -> reservationMenu());

        registerEmployee = new JButton("Registrar Empregado");
        registerEmployee.setBounds(250, 130, 250, 40);
        registerEmployee.addActionListener(e -> employeeRegisterMenu());

        changeCharge = new JButton("Alterar Cobrança");
        changeCharge.setBounds(0, 130, 250, 40);
        changeCharge.addActionListener(e -> changeChargeMenu());

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

        confirmRegisterEmployee = new JButton("Cadastrar");
        confirmRegisterEmployee.setBounds(190, 700, 120, 30);
        confirmRegisterEmployee.addActionListener(e -> confirmRegisterEmployee());

        confirmChangeChargeRoom = new JButton("Alterar");
        confirmChangeChargeRoom.setBounds(190, 700, 120, 30);
        confirmChangeChargeRoom.addActionListener(e -> confirmChangeChargeRoom());

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

        employeeRegisterNameInput = new JTextField();
        employeeRegisterNameInput.setBounds(10, 290, 480, 30);

        employeeRegisterCPFInput = new JTextField();
        employeeRegisterCPFInput.setBounds(10, 340, 480, 30);

        changeChargeRoomInput = new JTextField();
        changeChargeRoomInput.setBounds(10, 290, 480, 30);

        changeChargeValueInput = new JTextField();
        changeChargeValueInput.setBounds(10, 340, 480, 30);

        // Choice //
        String occupations[] = { "Administrador", "Recepcionista", "Camareira" };
        occupationsComboBoxInput = new JComboBox<>(occupations);
        occupationsComboBoxInput.setBounds(10, 390, 480, 30);

        frame.add(title);
        frame.add(confirmRegister);
        frame.add(register);
        frame.add(checkin);
        frame.add(checkout);
        frame.add(reservation);
        frame.add(registerEmployee);
        frame.add(changeCharge);

        frame.add(currentMenu);

        frame.add(output);

        frame.add(clientNameLabel);
        frame.add(clientNameInput);
        frame.add(clientCPFLabel);
        frame.add(clientCPFInput);

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

        frame.add(employeeRegisterNameLabel);
        frame.add(employeeRegisterNameInput);
        frame.add(employeeRegisterCPFLabel);
        frame.add(employeeRegisterCPFInput);
        frame.add(employeeRegisterOcupationLabel);
        frame.add(occupationsComboBoxInput);
        frame.add(confirmRegisterEmployee);

        frame.add(changeChargeRoomLabel);
        frame.add(changeChargeRoomInput);
        frame.add(changeChargeValueLabel);
        frame.add(changeChargeValueInput);
        frame.add(confirmChangeChargeRoom);

        frame.setSize(windowWidth, windowHeight);

        frame.setTitle("Menu do Gerente");

        frame.setLayout(null);

        frame.setVisible(true);

        makeCheckInInvisible();
        makeCheckOutInvisible();
        makeRegisterInvisible();
        makeReservationInvisible();
        makeRegisterEmployeeInvisible();
        makeChangeChargeInvisible();

        this.clients = clients;
        this.receptionist = receptionist;
        this.receptionists = receptionists;
        this.housekeepers = housekeepers;

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

    public void makeRegisterEmployeeInvisible() {
        employeeRegisterCPFInput.setVisible(false);
        employeeRegisterCPFLabel.setVisible(false);
        employeeRegisterNameInput.setVisible(false);
        employeeRegisterNameLabel.setVisible(false);
        occupationsComboBoxInput.setVisible(false);
        employeeRegisterOcupationLabel.setVisible(false);
        confirmRegisterEmployee.setVisible(false);
    }

    public void makeChangeChargeInvisible() {

        changeChargeRoomLabel.setVisible(false);
        changeChargeRoomInput.setVisible(false);
        changeChargeValueLabel.setVisible(false);
        changeChargeValueInput.setVisible(false);
        confirmChangeChargeRoom.setVisible(false);

    }

    public void checkinMenu() {

        currentMenu.setText("Check in");

        checkInRoomLabel.setVisible(true);
        checkInRoomInput.setVisible(true);
        confirmCheckIn.setVisible(true);

        makeRegisterInvisible();
        makeCheckOutInvisible();
        makeReservationInvisible();
        makeRegisterEmployeeInvisible();
        makeChangeChargeInvisible();

    }

    public void checkOutMenu() {

        currentMenu.setText("Check Out");

        checkOutRoomLabel.setVisible(true);
        checkOutRoomInput.setVisible(true);
        confirmCheckOut.setVisible(true);

        makeRegisterInvisible();
        makeCheckInInvisible();
        makeReservationInvisible();
        makeRegisterEmployeeInvisible();
        makeChangeChargeInvisible();

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
        makeRegisterEmployeeInvisible();
        makeChangeChargeInvisible();

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
        makeRegisterEmployeeInvisible();
        makeChangeChargeInvisible();

    }

    public void employeeRegisterMenu() {
        currentMenu.setText("Cadastro Empregado");

        employeeRegisterCPFInput.setVisible(true);
        employeeRegisterCPFLabel.setVisible(true);
        employeeRegisterNameInput.setVisible(true);
        employeeRegisterNameLabel.setVisible(true);
        occupationsComboBoxInput.setVisible(true);
        employeeRegisterOcupationLabel.setVisible(true);
        confirmRegisterEmployee.setVisible(true);

        makeCheckInInvisible();
        makeCheckOutInvisible();
        makeReservationInvisible();
        makeRegisterInvisible();
        makeChangeChargeInvisible();
    }

    public void changeChargeMenu() {
        currentMenu.setText("Alterar Cobrança");

        changeChargeRoomLabel.setVisible(true);
        changeChargeRoomInput.setVisible(true);
        changeChargeValueLabel.setVisible(true);
        changeChargeValueInput.setVisible(true);
        confirmChangeChargeRoom.setVisible(true);

        makeCheckInInvisible();
        makeCheckOutInvisible();
        makeReservationInvisible();
        makeRegisterInvisible();
        makeRegisterEmployeeInvisible();
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

        output.setText("Check In do quarto " + quarto + " realizado!");
    }

    public void confirmCheckOut() {
        String quarto = checkOutRoomInput.getText();

        output.setText("Check Out do quarto " + quarto + " realizado!");
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

    public void confirmRegisterEmployee() {
        String CPF = employeeRegisterCPFInput.getText();
        String name = employeeRegisterNameInput.getText();
        String occupation = occupationsComboBoxInput.getSelectedItem().toString();

        try {
            if (occupation.equals("Recepcionista")) {
                receptionists.add(new Receptionist(name, Integer.valueOf(CPF)));
                output.setText("Recepcionista: " + name + " Cadastrada");
            } else if (occupation.equals("Camareira")) {
                housekeepers.add(new Housekeeper(name, Integer.valueOf(CPF)));
                output.setText("Camareira" + name + " Cadastrada");
            } else if (occupation.equals("Administrador")) {
                output.setText("Administrador" + name + " Cadastrada");
            }
        } catch (Exception e) {
            output.setText("Cadastro Inválido!");
        }
    }

    public void confirmChangeChargeRoom() {
        String roomNumber = changeChargeRoomInput.getText();
        String value = changeChargeValueInput.getText();

        try {
            for (Reservation reservation : reservations) {
                if (reservation.getRoom().getNumber() == Integer.parseInt(roomNumber)) {
                    reservation.setExpenses(Integer.parseInt(value));
                    output.setText("Valor do quarto " + roomNumber + " alterado para " + value);
                    break;
                } else {
                    output.setText("Reserva não encontrada");
                }

            }

        } catch (Exception e) {
            output.setText("Alteração não realizada");

            // TODO: handle exception
        }

    }

}
