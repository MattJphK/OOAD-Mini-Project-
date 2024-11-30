package Transactions;

public class Deposit extends Transaction {
    protected float depositAmount;

    public Deposit(float currentAmount, String date, float depositAmount) {
        super(currentAmount, date);
        this.depositAmount = depositAmount;
    }

    public float calDepositAmount() {
        currentAmount = currentAmount + depositAmount;
        return currentAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDeposit Amount: " + depositAmount + " " + calDepositAmount() +
                " New Balance: €" + currentAmount;
    }


}
