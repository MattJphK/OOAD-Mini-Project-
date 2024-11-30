import java.util.*;
import java.io.*;
import java.lang.*;
import Bookings.*;
import Transactions.*;


public class Main {
    public static void main(String[] args) {

        Branch branch1 = new Branch();
        branch1.setBranchID(401);

        Staff staff1 = new Staff("John Chris", 201);
        staff1.setBranch(branch1);


        Booking booking1 = new Booking();
        booking1.setBookingName("The Murphy's");
        booking1.setBookingId(101);
        booking1.setBanker(staff1);
        booking1.setBookingType(BookingType.IN_PERSON);


        System.out.println(booking1);
        System.out.println();

        Withdraw withdraw1 = new Withdraw(2000, "2/12/24",500);

        System.out.println(withdraw1);
        System.out.println();


        Deposit deposit1 = new Deposit(2000, "2/12/24",500);

        System.out.println(deposit1);
        System.out.println();

        Loans loan1 = new Loans();
        loan1.setLoanAmount(300000);
        loan1.setLoanType(LoanType.MORTGAGE);

        System.out.println(loan1);





    }
}