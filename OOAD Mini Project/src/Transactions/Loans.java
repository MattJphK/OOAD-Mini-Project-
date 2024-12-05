package Transactions;

public class Loans {
    private int loanAmount;
    private LoanType loanType;

    public Loans(int loanAmount, LoanType loanType) {
        this.loanAmount = loanAmount;
        this.loanType = loanType;

    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        if (loanAmount < 0){
            throw new NegativeNumException("loanAmount cannot be negative number otherwise the loan loses you money");
        }
        this.loanAmount = loanAmount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    @Override
    public String toString() {
        return "Loan Amount: " + loanAmount + ", LoanType: " + loanType;
    }
}
