import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Virat");
        customer.setDateOfBirth("28/3/2011");
        customer.setGender(GENDER.male);
        customer.setAddress("BTM");
        customer.setCity("Bangalore");
        customer.setState("Karnataka");
        customer.setTelephoneNumber("64339283");
        customer.setFax("3242132");
        customer.setPin("13455");
        customer.setEmailAddress("virat@gmail.com");
        customer.displayCustomerDetails();

        Account account = new Account();
        account.setCustomerId(12434);
        account.setType(ACCOUNTTYPE.savings);
        account.setInitialDeposit(800);
        account.displayAccountDetails();



    }
}
