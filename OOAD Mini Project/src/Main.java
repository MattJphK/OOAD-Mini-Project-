import java.lang.*;
import Bookings.*;
import Transactions.*;


public class Main {
    public static void main(String[] args) {

        Staff staff1 = new Staff("John Chris", 201);

        BookingInfo booking1 = new BookingInfo(401);
        booking1.setBookingName("The Murphy's");
        booking1.setBookingId(101);
        booking1.setBanker(staff1);
        booking1.setBookingType(BookingType.CONFIRMED);
        booking1.setDate("4/12/24");


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