public class Ticket {
    private int id;
    private String number;
    private Passenger passenger;

    public Ticket(int id, String number, Passenger passenger) {
        this.id = id;
        this.number = number;
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", passenger=" + passenger.getName() +
                '}';
    }
    public void displayPassengerDetails(){
        System.out.println(this.toString());
    }
}
