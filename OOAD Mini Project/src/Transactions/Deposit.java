package Transactions;
import Customer.*;

public class Deposit extends Transaction implements CalAmount {
    protected float depositAmount;

    public Deposit(Person person,float currentAmount, String date, float depositAmount) {
        super(person,currentAmount, date);
        this.depositAmount = depositAmount;
    }
    @Override
    public float calAmount() {
        currentAmount = currentAmount + depositAmount;
        return currentAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDeposit Amount: " + depositAmount + " New Balance: € " + calAmount();
    }


}
