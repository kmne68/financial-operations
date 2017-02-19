
package business;

/**
 *
 * @author ptd
 */
public class Annuity {
    private double deposit, rate;
    private int term;
    private boolean built;  //whether fv has been built
    //private double fv;     //final value of annuity
    private double[] beginningBalance, interestEarned, endingBalance;
    
    public Annuity(double d, double r, int term) {
        //constructor for class
        this.deposit = d;
        this.rate = r;
        this.term = term;
        this.built = false;
        //this.fv = 0;
        calculateAnnuity();
    }
    public double getDeposit() {
        return this.deposit;
    }
    public double getRate() {
        return this.rate;
    }
    public int getTerm() {
        return this.term;
    }
    public double getFinalValue() {
        if (!built) {
            calculateAnnuity();
        }
        return this.endingBalance[this.term-1];
    }
    public double getBeginningBalance(int mo) {
        if (!built) { calculateAnnuity(); }
        if (mo < 1 || mo > this.term) { return 0; }
        return this.beginningBalance[mo-1];
    }
    public double getInterestEarned(int mo) {
        if (!built) { calculateAnnuity(); }
        if (mo < 1 || mo > this.term) { return 0; }
        return this.interestEarned[mo-1];
    }
    public double getEndingBalance(int mo) {
        if (!built) { calculateAnnuity(); }
        if (mo < 1 || mo > this.term) { return 0; }
        return this.endingBalance[mo-1];
    }
    private void calculateAnnuity() {
        //internal logic for building an annuity...
        //this.fv = 0;
        //double intearned=0;
        this.beginningBalance = new double[this.term];
        this.interestEarned = new double[this.term];
        this.endingBalance = new double[this.term];
        
        beginningBalance[0] = 0;
        for (int i=0; i<this.term; i++) {
            if (i > 0) {
                this.beginningBalance[i] = this.endingBalance[i-1];
            }
            this.interestEarned[i] = (this.beginningBalance[i] + this.deposit )* (this.rate/12.0);
            this.endingBalance[i] = this.beginningBalance[i] + this.interestEarned[i] + this.deposit;
            //this.fv = this.fv + intearned + this.deposit;
        }
        this.built = true;
    }
    
}