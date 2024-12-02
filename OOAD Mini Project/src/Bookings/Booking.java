package Bookings;

public class Booking {
    //Variables
    private String bookingName;
    private int bookingId;
    private BookingType bookingType;
    private Staff banker;

    public BookingType getBookingType() {
        return bookingType;
    }

    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }



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
