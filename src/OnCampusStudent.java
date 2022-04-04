public class OnCampusStudent extends Student {
    public static int RESIDENT = 1;
    public static int NON_RESIDENT = 2;
    private int mResident;
    private double mProgramFee;

    /**
     * Default Constructor
     */
    OnCampusStudent() {
        this(null, null, null);
    }

    /**
     * Second Constructor - assigns an ID, first name, and last name to an online student
     * @param pId String
     * @param pFirstName String
     * @param pLastName String
     */
    OnCampusStudent(String pId, String pFirstName, String pLastName) {
        setId(pId);
        setFirstName(pFirstName);
        setLastName(pLastName);
    }

    /**
     * overridden abstract method declared in the Student class
     * Calculates the tuition due for an on campus student as the sum of the residency-based base fee, any program fee,
     * and the product of any credits beyond the maximum 18 included with the residency-based base fee and the associated
     * per-credit rate
     */
    @Override
    public void calcTuition() {
        double tuition = 0.0;
        if (getResidency() == RESIDENT) {
            tuition += TuitionConstants.ONCAMP_RES_BASE;
        } else {
            tuition += TuitionConstants.ONCAMP_NONRES_BASE;
        }
        tuition += getProgramFee();
        if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
            tuition += (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }
        setTuition(tuition);
    }

    /**
     * Getter to retrieve the program fee for the on campus student
     * @return programFee double
     */
    public double getProgramFee() {
        return mProgramFee;
    }

    /**
     * Getter to retrieve the residency status of the on campus student
     * @return resident int
     */
    public int getResidency() {
        return mResident;
    }

    /**
     * Setter to assign a programFee to an on campus student
     * @param pProgramFee double
     */
    public void setProgramFee(double pProgramFee) {
        this.mProgramFee = pProgramFee;
    }

    /**
     * Setter to assign a residency state to an on campus student
     * @param pResident int
     */
    public void setResidency(int pResident) {
        this.mResident = pResident;
    }
}
