public class OnlineStudent extends Student {
    private boolean mTechFee;


    public OnlineStudent() {
        this(null, null, null);
    }

    public OnlineStudent(String pId, String pFirstName, String pLastName) {
        setId(pId);
        setFirstName(pFirstName);
        setLastName(pLastName);
    }

    @Override
    public void calcTuition() {
        double tuition = 0.0;
        if (getTechFee()) {
            tuition += TuitionConstants.ONLINE_TECH_FEE;
        }
        tuition += (getCredits() * TuitionConstants.ONLINE_CREDIT_RATE);
        setTuition(tuition);
    }

    public boolean getTechFee() {
        return this.mTechFee;
    }

    public void setTechFee(boolean pTechFee) {
        this.mTechFee = pTechFee;
    }

}
