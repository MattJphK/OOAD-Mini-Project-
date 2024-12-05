package Transactions;

public class Withdraw extends Transaction implements CalAmount {
    protected float withdrawAmount;

    public Withdraw(float currentAmount, String date, float withdrawAmount) {
        super(currentAmount, date);
        this.withdrawAmount = withdrawAmount;
;    }
    @Override
    public float calAmount() {
        currentAmount = currentAmount - withdrawAmount;
        return currentAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWithdraw Amount: " + withdrawAmount +
                " New Balance: € " + calAmount() ;
    }

}
