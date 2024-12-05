package Customer;

public abstract class Person {
    protected String name;
    protected String email;
    private CustomerID custId;

    public Person(String name, String email, CustomerID custId) {
        this.name = name;
        this.email = email;
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerID getCustId() {
        return custId;
    }

    public void setCustId(CustomerID custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + ' ' + ", email='" + email + ' ' + ", custId=" + custId + '}';
    }
}
