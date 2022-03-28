import java.util.InputMismatchException;

public class Account {
    private int customerId;
    private ACCOUNTTYPE type;
    private float initialDeposit;

    public Account(int customerId, ACCOUNTTYPE type, float initialDeposit) {
        this.customerId = customerId;
        this.type = type;
        this.initialDeposit = initialDeposit;
    }

    public Account() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if (customerId == 0) {
            throw new MandatoryFieldMissingException("Customer id is mandatory and cannot be blank");
        } else {
            try {
                this.customerId = customerId;
            } catch (InputMismatchException e) {
                System.out.println("Id has to be numbers only. Please enter valid id");
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public ACCOUNTTYPE getType() {
        return type;
    }

    public void setType(ACCOUNTTYPE type) {
        this.type = type;
    }

    public float getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(float initialDeposit) {
        if (initialDeposit==0){
            throw new MandatoryFieldMissingException("Initial deposit is mandatory");
        }else{
            try {
                if (initialDeposit<500){
                throw new MinimumBalanceNotMaintainedException("Initial Deposit amount must be greater than 500");
            }else{
                    this.initialDeposit = initialDeposit;
                }

            } catch (InputMismatchException e) {
                System.out.println("Initial deposit must be a number ");
            }
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "customerId=" + customerId +
                ", type=" + type +
                ", initialDeposit=" + initialDeposit +
                '}';
    }

    public void displayAccountDetails() {
        System.out.println(this.toString());
    }


}
