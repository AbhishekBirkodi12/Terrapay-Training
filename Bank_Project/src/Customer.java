public class Customer {
    private String name;
    private GENDER gender;
    private String dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String telephoneNumber;
    private String fax;
    private String emailAddress;

    public Customer(String name, GENDER gender, String dateOfBirth, String address,
                    String city, String state, String pin, String telephoneNumber,
                    String fax, String emailAddress) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.telephoneNumber = telephoneNumber;
        this.fax = fax;
        this.emailAddress = emailAddress;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            //System.out.println("Customer name is mandatory and cannot be blank");
            throw new MandatoryFieldMissingException("Customer name is mandatory and cannot be blank");
        } else if (name.length() > 25) {
            //System.out.println("Customer name cannot have more than 25 character");
            throw new MaximumLengthExceededException("Customer name cannot have more than 25 character");
        } else {
            this.name = name;
        }

    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        if (gender == null) {
            throw new MandatoryFieldMissingException("Gender is mandatory and cannot be blank");
        } else {
            this.gender = gender;
        }

    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth.length() == 0) {
            throw new MandatoryFieldMissingException("Date of Birth is mandatory and cannot be blank");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() == 0) {
            throw new MandatoryFieldMissingException("Address is mandatory and cannot be blank");
        } else if (address.length() > 50) {
            throw new MaximumLengthExceededException("Address cannot have more than 50 characters");
        } else {
            this.address = address;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city.length() == 0) {
            throw new MandatoryFieldMissingException("City is mandatory and cannot be blank");
        }else if (city.length() >25){
            throw new MaximumLengthExceededException("City cannot have more than 25 characters");
        }else{
            this.city = city;
        }

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state.length() == 0){
            throw new MandatoryFieldMissingException("State is mandatory and cannot be blank");
        }else if (state.length()>25){
            throw new MaximumLengthExceededException("State cannot have more than 25 characters");
        }
        else{
            this.state = state;
        }

    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        if (pin.length() == 0){
            throw new MandatoryFieldMissingException("pin is mandatory and cannot be blank");
        }else if (pin.length()>7){
            throw new MaximumLengthExceededException(" pin cannot have more than 7 characters");
        }else{
            this.pin = pin;
        }

    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber.length()>15){
            throw new MaximumLengthExceededException(" Telephone cannot have more than 15 characters");
        }else{
            this.telephoneNumber = telephoneNumber;
        }

    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        if (fax.length() >15){
            throw new MaximumLengthExceededException("Only 15 characters are allowed");

        }else{
            this.fax = fax;
        }

    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress.length()==0){
            throw new MandatoryFieldMissingException("Email address is mandatory and cannot be blank");
        }
       else if (emailAddress.length()>30){
            throw new MaximumLengthExceededException("Email cannot have more than 30 characters");
       }else{
           this.emailAddress = emailAddress;
       }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin='" + pin + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", fax='" + fax + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
    public void displayCustomerDetails(){
        System.out.println(this.toString());
    }
}
