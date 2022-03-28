import java.awt.print.Book;

public class DigitalBook extends Books {
    private String url;

    public DigitalBook(int price, String title) {
        super(title, price);
    }
    @Override//polymorphism
    public void deposit() {
        super.deposit();
        //extra logic
        deductCharges();
    }
    private void deductCharges() {
        System.out.println("deducted");
    }

    public String getUrl() {
        return url;
    }
}
