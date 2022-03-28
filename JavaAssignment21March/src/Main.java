public class Main {
    public static void main(String[] args) {
        Customer c1=new Customer("First Customer","HSR Bangalore","9999911111","first@melior.in");
        c1.customerDetails();

        Account a1=new Account("01/05/2011",ACCOUNTTYPE.SB,500,c1);
        a1.accountDetails();


    }
}
