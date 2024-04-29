public class Room {
    private int number;
    private int costPerDay;

    public Room(int number, int costPerDay) {
        this.number = number;
        this.costPerDay = costPerDay;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public int getNumber() {
        return number;
    }

}
