package Bookings;

public final class BookingInfo extends Booking {
    private int branchID;

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public BookingInfo(int branchID) {
        super();
        this.branchID = branchID;
    }

    @Override
    public String toString() {
        return super.toString() + " Branch ID" + " " + branchID;
    }

}
