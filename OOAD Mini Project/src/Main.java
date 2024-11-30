import java.util.*;
import java.io.*;
import java.lang.*;
import Bookings.*;

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




    }
}