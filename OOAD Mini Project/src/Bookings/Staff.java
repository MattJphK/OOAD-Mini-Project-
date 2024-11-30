package Bookings;

public class Staff extends Booking {
    protected String staffName;
    protected int staffID;
    private Branch branch;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Staff(String staffName, int staffID) {
        this.staffName = staffName;
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "Your Banker is " + staffName + " ID: " + staffID + branch;
    }



}
