public class BankDemo {
    public static void main(String[] args) {
        Customer c1=new Customer("First Customer","Hsr Bangalore","7906555","first@gmail.com");

        Customer c2=new Customer("Second Customer","BTM Bangalore","7126555","second@gmail.com");

        Customer c3=new Customer("Third Customer","Yelahanka Bangalore","7904555","third@gmail.com");

        Account a1=new Account("7/9/2022",ACCOUNTTYPE.SB,500,c1);
        Account a2=new Account("6/01/2021",ACCOUNTTYPE.SB,500,c2);

        Account a3=new Account("2/02/2000",ACCOUNTTYPE.FD,5000,c3);
        System.out.println("Customer Details\n----------------------------------");
        c1.customerDetails();
        c2.customerDetails();
        c3.customerDetails();
        System.out.println("Account Details\n----------------------------------");
        a1.accountDetails();
        a2.accountDetails();
        a3.accountDetails();







    }
}
