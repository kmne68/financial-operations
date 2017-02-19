
package business;

/**
 *
 * @author ptd
 */
public class Loan extends Financial {
    
    private double principle, rate, monthlyPayment;
    private int term;
    private boolean built;
    private double[] beginningBalance, interestCharge, endingBalance;
    
    public Loan() {
        super();
        
        this.built = false;
    }
    
    public Loan(double principle, double rate, int term) {
        super(principle, rate, term);
        this.principle = principle;
        this.rate = rate;
        this.term = term;
        monthlyPayment = 0;
        built = false;
        
        buildLoan();
    }

    public double getPrinciple() {
        return principle;
    }

    public double getRate() {
        return rate;
    }

    public double getMonthlyPayment() {
        if (!built) { buildLoan(); }
        return monthlyPayment;
    }

    public int getTerm() {
        return term;
    }
    public double getBeginningBalance(int mo) {
        if (!built) { buildLoan(); }
        if (mo < 1 || mo > this.term) { return 0; }
        return this.beginningBalance[mo-1];
    }
    public double getInterestCharge(int mo) {
        if (!built) { buildLoan(); }
        if (mo < 1 || mo > this.term) { return 0; }
        return this.interestCharge[mo-1];
    }
    public double getEndingBalance(int mo) {
        if (!built) { buildLoan(); }
        if (mo < 1 || mo > this.term) { return 0; }
        return this.endingBalance[mo-1];
    }
    private void buildLoan() {
        //calculate Monthly Payment....
        double morate = this.rate / 12.0;
        double denom = Math.pow((1+morate),this.term) - 1;
        this.monthlyPayment = (morate + morate/denom) * this.principle;
        
        this.beginningBalance = new double[this.term];
        this.interestCharge = new double[this.term];
        this.endingBalance = new double[this.term];
        
        this.beginningBalance[0] = this.principle;
        for(int i=0; i< this.term; i++) {
            if (i > 0) {
                this.beginningBalance[i] = this.endingBalance[i-1];
            }
            this.interestCharge[i] = this.beginningBalance[i] * morate;
            this.endingBalance[i] = this.beginningBalance[i] + this.interestCharge[i] - this.monthlyPayment;
        }
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