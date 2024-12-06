package Bookings;
import Customer.*;


public abstract class Booking {
    //Variables
    public String bookingName;
    private Person person;
    private int bookingId;
    protected String date;
    public BookingType bookingType;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //Constructor
    public Booking() {
        this.bookingName = bookingName;
        this.bookingId = bookingId;
        this.date = date;
        this.bookingType = bookingType;
        this.banker = banker;
        this.person = person;

    }

    @Override
    public String toString() {
        return person + "\n"+ "Booking [bookingId=" + bookingId + ", bookingName=" + bookingName + " Date: " + date + "\n" + " " + banker + " This is an "
                + bookingType + " appointment" + "]";

    }
}
