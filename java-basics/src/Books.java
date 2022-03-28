public class Books implements IBook{
    private static int counter;
    private int id;
    private String title;// immutable read only
    private float price;
    boolean issued;
    STATUS status;//issued, damaged, available


    public Books(){
        this.id=++counter;
    }

    public void issue() {
        if(this.status== STATUS.available){
            this.status=STATUS.issued;
        }else{
            throw new BookNotAvailableException();
        }

    }


    public Books(String title, float price) {
        this();
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", issued=" + issued +
                ", status=" + status +
                '}';
    }

    public void deposit(){
        if (status==STATUS.issued){
            this.status=STATUS.available;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price<=0){
            throw new IllegalArgumentException("Price cannot be less than or equal to zero");
        }
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
}
