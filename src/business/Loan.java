
package business;

/**
 *
 * @author ptd
 */
public class Loan extends Financial {
    
    private double monthlyPayment;
    private boolean built;
    private double[] beginningBalance;
    private double[] interestCharge;
    private double[] endingBalance;
    
    
    public Loan() {
        super();
    }
    
    
    public Loan(double principle, double rate, int term) {
        super(principle, rate, term);

        monthlyPayment = 0;
        built = false;
        
        if(super.isValid()) {
            buildLoan();
        }
    }


    @Override
    public double getResult() {
        if (!built) { buildLoan(); }
        return monthlyPayment;
    }


    public double getBeginningBalance(int mo) {
        if (!built) { buildLoan(); }
        if (mo < 1 || mo > super.getTerm()) { return 0; }
        return this.beginningBalance[mo-1];
    }
    
    public double getInterestCharge(int mo) {
        if (!built) { buildLoan(); }
        if (mo < 1 || mo > super.getTerm()) { return 0; }
        return this.interestCharge[mo-1];
    }
    
    public double getEndingBalance(int mo) {
        if (!built) { buildLoan(); }
        if (mo < 1 || mo > super.getTerm()) { return 0; }
        return this.endingBalance[mo-1];
    }
    
    private void buildLoan() {
        //calculate Monthly Payment....
        double monthlyRate = super.getRate() / 12.0;
        double denom = Math.pow((1 + monthlyRate), super.getTerm()) - 1;
        this.monthlyPayment = (monthlyRate + monthlyRate/denom) * super.getAmount();
        
        this.beginningBalance = new double[super.getTerm()];
        this.interestCharge = new double[super.getTerm()];
        this.endingBalance = new double[super.getTerm()];
        
        this.beginningBalance[0] = super.getAmount();
        for(int year = 0; year < super.getTerm(); year++) {
            if (year > 0) {
                this.beginningBalance[year] = this.endingBalance[year-1];
            }
            this.interestCharge[year] = this.beginningBalance[year] * monthlyRate;
            this.endingBalance[year] = this.beginningBalance[year] + this.interestCharge[year] - this.monthlyPayment;
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