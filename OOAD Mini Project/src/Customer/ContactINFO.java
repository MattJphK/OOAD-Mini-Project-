package Customer;

public class ContactINFO extends Person {
    private String phone;
    protected String address;
    public CustomerType customerType;

    public ContactINFO(String name, String email, String phone, String address, CustomerType customerType) {
        super(name, email);
        this.phone = phone;
        this.address = address;
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
        return "ContactINFO{" + "phone='" + phone + ' ' + ", address='" + address + ' ' + ", name='" + name + ' ' + ", email='" + email + ' ' + "CustomerType" + customerType + '}';
    }
}

