import java.util.Date;

public class Bank {
    public static void main(String[] args) {
        Address manish=new Address("Mumbai","Maharashtra","143256");
        Account ma=new Account("Manish",manish,5000,new Date(),STATUS.ACTIVE,ACCOUNTTYPE.SAVINGS);
        ma.viewAccountDetail();
        System.out.println( ma.getBalanceAmount());
        ma.deposit(5000);
        System.out.println( ma.getBalanceAmount());
        ma.withdraw(500);
        System.out.println( ma.getBalanceAmount());

    }
}
