
package business;

/**
 *
 * @author ptd
 */
public class Annuity extends Financial {
    
    public static final String AMOUNTDESCRIPTION = "Monthly Deposit";
    public static final String RESULTDESCRIPTION = "Final Value";
    
/*    private double deposit;
    private double rate;
    private int term;       */
    private boolean built;  //whether fv has been built
    //private double fv;     //final value of annuity
    private double[] beginningBalance;
    private double[] interestEarned;
    private double[] endingBalance;
    
    
    public Annuity() {
        super();
    }
    
    public Annuity(double deposit, double rate, int term) {
        super(deposit, rate, term);        

        this.built = false;
        if(super.isValid()) {
        //this.fv = 0;
            calculateAnnuity();
        }
    }
    
    
    @Override
    public double getResult() {
        if (!built) {
            calculateAnnuity();
        }
        return this.endingBalance[super.getTerm() - 1];
    }
    public double getBeginningBalance(int mo) {
        if (!built) { calculateAnnuity(); }
        if (mo < 1 || mo > super.getTerm()) { return 0; }
        return this.beginningBalance[mo-1];
    }
    public double getInterestEarned(int mo) {
        if (!built) { calculateAnnuity(); }
        if (mo < 1 || mo > super.getTerm()) { return 0; }
        return this.interestEarned[mo-1];
    }
    public double getEndingBalance(int mo) {
        if (!built) { calculateAnnuity(); }
        if (mo < 1 || mo > super.getTerm()) { return 0; }
        return this.endingBalance[mo-1];
    }
    private void calculateAnnuity() {
        //internal logic for building an annuity...
        //this.fv = 0;
        //double intearned=0;
        this.beginningBalance = new double[super.getTerm()];
        System.out.println("term " + this.beginningBalance.toString());
        this.interestEarned = new double[super.getTerm()];
        System.out.println("term " + this.interestEarned.toString());
        this.endingBalance = new double[super.getTerm()];
        System.out.println("term " + this.endingBalance.toString());
        
        beginningBalance[0] = 0;
        for (int month = 0; month < super.getTerm(); month++) {
            if (month > 0) {
                this.beginningBalance[month] = this.endingBalance[month - 1];
            }
            this.interestEarned[month] = (this.beginningBalance[month] + super.getAmount()) *  (super.getRate() / 12.0);
            this.endingBalance[month] = this.beginningBalance[month] + this.interestEarned[month] + super.getAmount();
            //this.fv = this.fv + intearned + this.deposit;
        }
        this.built = true;
    }

    @Override
    public double getPrincipalFactor(int month) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getInterestFactor(int month) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBeginningBalanceDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPrincipleFactorDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInterestFactorDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEndingBalanceDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}