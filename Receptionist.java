public class Receptionist extends Staff {

    public Receptionist(String name, int id) {
        super(name, id);
    }

    public Reservation makeReservation(Client client, Room room) {

        Reservation newReservation = new Reservation(client, this, room);

        return newReservation;

    }

    public void checkOutClient(Reservation reservation) {
        reservation.checkoutNow();

    }

}
