public class Customer {
    static int counter=1000;
    int id;
    String name;
    String address;
    String telephone;
    String email;

   /* public Customer(){
        this.id=++counter;
    }*/

    public Customer(String name, String address, String telephone, String email) {
        this.id=++counter;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    @Override
    public String toString() {

        return
                "Customer Id : " + id +"\n"+
                "Customer Name : " + name + "\n" +
                "Customer Address : " + address + "\n" +
                "Customer Telephone : " + telephone + "\n" +
                "Customer Email : " + email + "\n";
    }

    public void customerDetails(){
        System.out.println(this.toString());
    }
}
