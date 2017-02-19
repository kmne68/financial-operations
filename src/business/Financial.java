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
    
    
    
    abstract public double getBeginningBalance(int month);
    abstract public double getPrincipalFactor(int month);
    abstract public double getInterestFactor(int month);
    abstract public double getEndingBalance(int month);
    abstract public String getBeginningBalanceDescription();
    abstract public String getPrincipleFactorDescription();
    abstract public String getInterestFactorDescription();
    abstract public String getEndingBalanceDescription();
    
}
