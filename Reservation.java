import java.util.Date;

public class Reservation {
    private Client client;
    private int expenses;
    private Date checkin;
    private Date checkout;
    private Receptionist receptionist;
    private Room room;

    public Reservation(Client client, Receptionist receptionist, Room room) {
        this.client = client;
        this.expenses = 0;
        this.room = room;
        this.receptionist = receptionist;
        this.checkin = new Date();

    }

    public Room getRoom() {
        return room;
    }

    public Client getClient() {
        return client;
    }

    public int getExpenses() {
        return expenses;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void checkoutNow() {
        this.checkout = new Date();
    }

    public void addExpenses(int charge) {
        this.expenses = this.expenses + charge;
    }

    public void setExpenses(int newValue) {
        this.expenses = newValue;
    }

    public String getDetails() {

        String details = "Reserva: \nClient:" + getClient().getName() + " \nRoom:" + getRoom().getNumber()
                + " \nReceptionist:"
                + getReceptionist().getName() + " \nCheck-in:" + getCheckin();

        if (getCheckout() != null) {
            details = details + " Check-out: " + getCheckout();
        }

        return details;
    }

}
