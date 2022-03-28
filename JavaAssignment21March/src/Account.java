public class Account {
    static int counter=100000;
    int accountNumber;
    String openingDate;
    ACCOUNTTYPE type;
    double balance;
    Customer customer;

    public Account(){
        this.accountNumber=++counter;
    }

    public Account(String openingDate, ACCOUNTTYPE type, double balance, Customer customer) {
        this.accountNumber=++counter;
        this.openingDate = openingDate;
        this.type = type;
        this.balance = balance;
        this.customer = customer;
    }

    @Override
    public String toString() {

        return         "Account Number : " + accountNumber + "\n"+
                        "Customer ID : " + customer.id + "\n"+
                        "Account creation Date : " + openingDate  + "\n"+
                        "Account Type : " + type  + "\n"+
                        "Account Balance: " + balance  + "\n";
    }

    public void accountDetails(){
        System.out.println(this.toString());
    }
}
