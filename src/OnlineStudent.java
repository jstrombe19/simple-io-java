public class OnlineStudent extends Student {
    private boolean mTechFee;

    /**
     * Default Constructor
     */
    public OnlineStudent() {
        this(null, null, null);
    }

    /**
     * Second Constructor - assigns an ID, first name, and last name to an online student
     * @param pId String
     * @param pFirstName String
     * @param pLastName String
     */
    public OnlineStudent(String pId, String pFirstName, String pLastName) {
        setId(pId);
        setFirstName(pFirstName);
        setLastName(pLastName);
    }

    /**
     * overridden abstract method declared in the Student class
     * Calculates the tuition due for an online student as the sum of the online tech fee and the product of total
     * credits and the associated per-credit rate
     */
    @Override
    public void calcTuition() {
        double tuition = 0.0;
        if (getTechFee()) {
            tuition += TuitionConstants.ONLINE_TECH_FEE;
        }
        tuition += (getCredits() * TuitionConstants.ONLINE_CREDIT_RATE);
        setTuition(tuition);
    }

    /**
     * Getter method to retrieve whether a tech fee is due for the student in question
     * @return techFee boolean
     */
    public boolean getTechFee() {
        return this.mTechFee;
    }

    /**
     * Setter method to assign a boolean state to whether the student in question owes a tech fee
     * @param pTechFee boolean
     */
    public void setTechFee(boolean pTechFee) {
        this.mTechFee = pTechFee;
    }

}
