package Insurance;

import Customer.Person;

public abstract class Insurance  {
    private int insuranceID;
    private String Policy_No;
    private String Coverage;

    public Insurance(int insuranceID, String policy_No, String coverage) {
        this.insuranceID = insuranceID;
        Policy_No = policy_No;
        Coverage = coverage;
    }

    public String getPolicy_No() {
        return Policy_No;
    }

    public void setPolicy_No(String policy_No) {
        Policy_No = policy_No;
    }

    public String getCoverage() {
        return Coverage;
    }

    public void setCoverage(String coverage) {
        if (coverage == null) {
            throw new INVALIDInsuranceException("coverage is null");
        }
        this.Coverage = coverage;
    }

    @Override
    public String toString() {
        return "Insurance{" + "insuranceID=" + insuranceID + ", Policy_No='" + Policy_No + ' ' + ", Coverage='" + Coverage + ' ' + '}';
    }
}
