package Bookings;

public final class Branch extends Booking {
    private int branchID;

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    @Override
    public String toString() {
        return " Branch ID" + " " + branchID;
    }

}
