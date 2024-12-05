package Bookings;

public class Staff extends Booking {
    protected String staffName;
    protected int staffID;



    public Staff(String staffName, int staffID) {
        super();
        this.staffName = staffName;
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "Your Banker is " + staffName + " ID: " + staffID;
    }



}
