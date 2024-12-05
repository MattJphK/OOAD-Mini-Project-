package Transactions;
import Customer.*;

public class Withdraw extends Transaction implements CalAmount {
    protected float withdrawAmount;

    public Withdraw(Person person, float currentAmount, String date, float withdrawAmount) {
        super(person,currentAmount, date);
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
