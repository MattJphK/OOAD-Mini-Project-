package Insurance;

import Customer.Person;

public abstract class Insurance  {
    private int insuranceID;
    private String Policy_No;
    private String Coverage;
    private Person person;

    public Insurance(Person person,int insuranceID, String policy_No, String coverage) {
        this.person = person;
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

    public int getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person + "\n" + " Insurance{" + "insuranceID = " + insuranceID + ", Policy_No = " + Policy_No + ' ' + ", Coverage = " + Coverage + ' '  + '}';
    }
}
