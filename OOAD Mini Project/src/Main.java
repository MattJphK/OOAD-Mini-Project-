import java.lang.*;
import Bookings.*;
import Customer.ContactINFO;
import Customer.CustomerID;
import Customer.CustomerType;
import Insurance.*;
import Transactions.*;


public class Main {
    public static void main(String[] args) {

        CustomerID custId1 = new CustomerID();
        custId1.setCustomerID(1);

        ContactINFO customer1 = new ContactINFO("John Murphy","JohnM@gmail.com",custId1,"+353 897055190","43 Hazelbury Green"
        , CustomerType.INDIVIDUAL);

        //System.out.println(customer1);
        System.out.println();

        Staff staff1 = new Staff("John Chris", 201);

        BookingInfo booking1 = new BookingInfo(401);
        booking1.setBookingName("The Murphy's");
        booking1.setBookingId(101);
        booking1.setBanker(staff1);
        booking1.setBookingType(BookingType.CONFIRMED);
        booking1.setDate("4/12/24");
        booking1.setPerson(customer1);

        Claim claim = new Claim(45, 2993.00,78,"6171","Life", PolicyType.LIFE);
        System.out.println(claim);

        System.out.println(booking1);
        System.out.println();

        Withdraw withdraw1 = new Withdraw(2000, "2/12/24",500);

        System.out.println(withdraw1);
        System.out.println();

        Deposit deposit1 = new Deposit(2000, "2/12/24",500);

        System.out.println(deposit1);
        System.out.println();

        Loans loan1 = new Loans(30000,LoanType.MORTGAGE);
        System.out.println(loan1);
    }
}