import java.util.Date;

public class Account {
    private final String ownerName;
    private final Address address;
    private float balanceAmount;
    private final Date created_date;
    private final STATUS status;
    private ACCOUNTTYPE accountType;

    public Account(String ownerName, Address address, float balanceAmount, Date created_date, STATUS status,ACCOUNTTYPE accountType) {
        this.ownerName = ownerName;
        this.address = address;
        this.balanceAmount = balanceAmount;
        this.created_date = created_date;
        this.status = status;
        this.accountType = accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Address getAddress() {
        return address;
    }

    public float getBalanceAmount() {
        return balanceAmount;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public STATUS getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", address= city: " + address.getCity() + ",state: " + address.getState()
                + ",pin : " + address.getPin() +
                ", balanceAmount=" + balanceAmount +
                ", created_date=" + created_date +
                ", status=" + status +
                '}';
    }
    public void viewAccountDetail(){
        System.out.println(this.toString());

    }

    public void deposit(float amount){
        if (amount<0){
            System.out.println("Amount must be greater than zero");
        }else{
            this.balanceAmount=this.balanceAmount+amount;
        }
    }
    public void withdraw(float amount) {
        if (amount>this.balanceAmount){
            throw new AmountGreaterThanBalanceAmount("Requested Amount is greater than balance amount: Cannot be fulfilled");
        }else{
            this.balanceAmount=this.balanceAmount-amount;
        }
    }
}
