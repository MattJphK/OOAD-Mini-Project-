package Customer;

public class ContactINFO extends Person {
    private String phone;
    protected String address;
    public CustomerType customerType;

    public ContactINFO(String name, String email, CustomerID custId, String phone, String address, CustomerType customerType) {
        super(name, email,custId);
        this.phone = phone;
        this.address = address;
        this.customerType = customerType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPhone: " + phone + "\nAddress: " + address + "\nType: " + customerType;
    }
}

