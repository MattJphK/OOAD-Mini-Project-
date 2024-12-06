package Insurance;
import Customer.*;

public class Claim extends Insurance {
    private int ClaimID;
    private Double ClaimAmount;
    public PolicyType policyType;
    public static double tax = 20.00;

    public Claim(Person person, int claimID, Double claimAmount,int insuranceID, String policy_No, String coverage, PolicyType policyType) {
        super(person,insuranceID, policy_No, coverage);
        ClaimID = claimID;
        setClaimAmount(claimAmount);
        this.policyType = policyType;
    }

    public int getClaimID() {
        return ClaimID;
    }

    public void setClaimID(int claimID) {
        ClaimID = claimID;
    }

    public Double getClaimAmount() {
        return ClaimAmount;
    }

    public final void setClaimAmount(double claimAmount) {
        if (claimAmount >= 100.00) {
            this.ClaimAmount = claimAmount - tax;
        } else{
            this.ClaimAmount = claimAmount;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Claim{ClaimID = " + ClaimID + ", ClaimAmount = €" + ClaimAmount + " PolicyType = " + policyType + '}';
    }
}
