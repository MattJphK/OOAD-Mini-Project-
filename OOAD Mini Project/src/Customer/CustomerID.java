package Customer;

public class CustomerID{
    private int customerID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "CustomerID{" +
                "customerID=" + customerID +
                '}';
    }
}
