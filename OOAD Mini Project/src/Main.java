import java.lang.*;
import Bookings.*;
import Customer.ContactINFO;
import Customer.CustomerID;
import Customer.CustomerType;
import Insurance.*;
import Transactions.*;


public class Main {
    public static void main(String[] args) {
        //customerIds
        CustomerID custId1 = new CustomerID();
        custId1.setCustomerID(1);
        CustomerID custId2 = new CustomerID();
        custId2.setCustomerID(2);
        CustomerID custId3 = new CustomerID();
        custId3.setCustomerID(3);

        //Bank Customers
        ContactINFO customer1 = new ContactINFO("John Murphy","JohnM@gmail.com",custId1,"+353 897055190",
                "43 Hazelbury Green", CustomerType.INDIVIDUAL);
        ContactINFO customer2 = new ContactINFO("The Navan's","JNavan@gmail.com",custId2,"+353 899065679"
        ,"46 Crook Valley", CustomerType.COUPLE);
        ContactINFO customer3 = new ContactINFO("IBM","IBM@gmail.com",custId3,"+353 876565155"
        ,"3 Dublin Central", CustomerType.COMPANY);

        System.out.println();

        //Staff Member of the Bank
        Staff staff1 = new Staff("John Chris", 201);

        //Claim
        Claim claim = new Claim(customer1,45, 3000.00,78,"6171","Life", PolicyType.LIFE);
        System.out.println(claim);
        System.out.println();

        //Booking
        BookingInfo booking1 = new BookingInfo(401);
        booking1.setBookingName("Navan's");
        booking1.setBookingId(101);
        booking1.setBanker(staff1);
        booking1.setBookingType(BookingType.CONFIRMED);
        booking1.setDate("4/12/24");
        booking1.setPerson(customer2);

        System.out.println(booking1);
        System.out.println();

        //Withdraw Transaction
        Withdraw withdraw1 = new Withdraw(customer3,2000, "2/12/24",500);

        System.out.println(withdraw1);
        System.out.println();

        //Deposit Transaction
        Deposit deposit1 = new Deposit(customer1, 2000,"2/12/24",500);
        
        System.out.println(deposit1);
        System.out.println();

        //Loan
        Loans loan1 = new Loans(30000,LoanType.MORTGAGE);
        System.out.println(loan1);
    }
}