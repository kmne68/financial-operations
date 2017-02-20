/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Keith
 */
abstract public class Financial {
    
    private double deposit;
    private double rate;    
    private int term; 
    private String errorMessage;
    
    //private double fv;     //final value of annuity
    public Financial() {
        
        this.deposit = 0.0;
        this.rate = 0.0;
        this.term = 0;
    }
    

    public Financial(double deposit, double rate, int term) {
        
        this.deposit = deposit;
        this.rate = rate;
        this.term = term;
    }
    
    
    protected boolean isValid() {
        
        this.errorMessage = "";
        
        if(this.deposit <= 0) {
            this.errorMessage += "Deposit must be a positive value. ";
        }
        if(this.rate <= 0) {
            this.errorMessage += "Rate must be a positive value. "; 
        }
        if(this.term <= 0) {
            this.errorMessage += "Term must be a positive value. ";
        }
        return this.errorMessage.isEmpty();
    }

    public double getAmount() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }  
    
    
    public String getErrorMessage() {
        
        return errorMessage;
    }
    
    
    abstract public double getBeginningBalance(int month);
    abstract public double getPrincipalFactor(int month);
    abstract public double getInterestFactor(int month);
    abstract public double getEndingBalance(int month);
    
    abstract public double getResult();
    
    abstract public String getBeginningBalanceDescription();
    abstract public String getPrincipleFactorDescription();
    abstract public String getInterestFactorDescription();
    abstract public String getEndingBalanceDescription();
    
}
