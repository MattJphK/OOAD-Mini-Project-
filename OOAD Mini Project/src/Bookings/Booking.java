package Bookings;

public class Booking {
    //Variables
    private String bookingName;
    private int bookingId;
    protected String date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //Constructor
    public Booking() {
        this.bookingName = bookingName;
        this.bookingId = bookingId;
        this.date = date;
        this.bookingType = bookingType;
        this.banker = banker;

    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", bookingName=" + bookingName + " Date: " + date + " " + banker + " This is an "
                + bookingType + " appointment" + "]";

    }
}
