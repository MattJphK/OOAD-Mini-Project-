package Transactions;

public class Withdraw extends Transaction {
    protected float withdrawAmount;

    public Withdraw(float currentAmount, String date, float withdrawAmount) {
        super(currentAmount, date);
        this.withdrawAmount = withdrawAmount;
;    }

    public float calWithdrawAmount() {
        currentAmount = currentAmount - withdrawAmount;
        return currentAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWithdraw Amount: " + withdrawAmount + " " + calWithdrawAmount() +
                " New Balance: €" + currentAmount;
    }

}
