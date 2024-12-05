package Insurance;

public class Claim extends Insurance {
    private int ClaimID;
    private Double ClaimAmount;

    public Claim(int claimID, Double claimAmount,int insuranceID, String policy_No, String coverage) {
        super(insuranceID, policy_No, coverage);
        ClaimID = claimID;
        ClaimAmount = claimAmount;

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

    public void setClaimAmount(Double claimAmount) {
        ClaimAmount = claimAmount;
    }

    @Override
    public String toString() {
        return "Claim{ClaimID= " + ClaimID + ", ClaimAmount=" + ClaimAmount + super.toString() + '}';
    }
}
