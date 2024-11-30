package Transactions;

public abstract class Transaction {
    public float currentAmount;
    private String date;

    public Transaction(float currentAmount, String date) {
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

    @Override
    public String toString() {
        return "Transaction{" + "currentAmount=" + currentAmount + ", date=" + date + '}';
    }
}
