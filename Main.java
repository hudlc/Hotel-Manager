import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<Client>();
        ArrayList<Housekeeper> housekeepers = new ArrayList<Housekeeper>();
        ArrayList<Receptionist> receptionists = new ArrayList<Receptionist>();
        ArrayList<Reservation> reservations = new ArrayList<Reservation>();
        ArrayList<Room> rooms = new ArrayList<Room>();

        rooms.add(new Room(101, 150));
        rooms.add(new Room(102, 150));
        rooms.add(new Room(103, 150));
        rooms.add(new Room(201, 150));
        rooms.add(new Room(202, 150));
        rooms.add(new Room(203, 150));
        rooms.add(new Room(301, 150));
        rooms.add(new Room(302, 150));
        rooms.add(new Room(303, 150));

        clients.add((new Client("Joao", 123)));
        clients.add((new Client("Maria", 456)));
        receptionists.add((new Receptionist("Pedro", 123)));
        receptionists.add((new Receptionist("Ricardo", 123)));
        reservations.add(new Reservation(clients.get(0), receptionists.get(0), rooms.get(0)));

        HousekeeperInterface housekeeperInterface = new HousekeeperInterface(reservations);
        ManagerInterface managerInterface = new ManagerInterface(clients, reservations, rooms,
                receptionists.get(0), receptionists, housekeepers);
        RecepcionistInterface RecepcionistInterface = new RecepcionistInterface(clients, reservations, rooms,
                receptionists.get(0));

        // reservations.add(new Reservation(clients.get(0), receptionists.get(0),
        // rooms.get(0)));

        // for (Client client : clients) {
        // System.out.println("Nome:" + client.getName() + " ID:" + client.getId());
        // }

        // System.out.println(reservations.get(0).getDetails());

    }

}
