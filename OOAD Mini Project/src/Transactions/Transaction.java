package Transactions;
import Customer.*;

public abstract class Transaction {
    private Person person;
    public float currentAmount;
    private String date;

    public Transaction(Person person, float currentAmount, String date) {
        this.person = person;
        this.currentAmount = currentAmount;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(float currentAmount) {
        this.currentAmount = currentAmount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person +"\n" +"Transaction{" + "currentAmount=" + currentAmount + ", date=" + date + '}';
    }
}
