package Bookings;

public class Booking {
    //Variables
    private String bookingName;

    public BookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }

    private int bookingId;
    private BookingType bookingType;
    private Staff banker;

    public Staff getBanker() {
        return banker;
    }

    public void setBanker(Staff banker) {
        this.banker = banker;
    }

    //Constructor
    public Booking() {
        this.bookingName = bookingName;
        this.bookingId = bookingId;
    }

    //Methods
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", bookingName=" + bookingName + " " + banker + " This is an "
                + bookingType + " appointment" + "]";

    }
}
