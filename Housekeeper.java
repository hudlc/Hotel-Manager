public class Housekeeper extends Staff {

    public Housekeeper(String name, int id) {
        super(name, id);
    }

    public void cleanRoom(Reservation reservation) {
        reservation.addExpenses(25);
    }

}
