/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brianproject3;

/**
 *
 * @author brian
 */
public class PremiumMembers extends Members {
    
    private boolean isFeePaid;
    private boolean isPremiumMember;
    
    /**
     * Blank Constructor
     */
    public PremiumMembers(){
        
    }
    /**
     * Constructor for PremiumMembers
     * @param id int
     * @param fName String
     * @param lName String
     */
    public PremiumMembers(int id, String fName, String lName) {
        super(id, fName, lName);
    }
    
    /**
     * Constructor for PremiumMembers
     * @param id int
     * @param fName String
     * @param lName String
     * @param isFeedPaid Boolean
     * @param isPremiumMember Boolean
     */
    public PremiumMembers(int id, String fName, String lName, String paymentMethod, double lifeTime, boolean FeePaid, boolean isPremiumMember) {
        super(id, fName, lName, paymentMethod, lifeTime );
        this.isFeePaid = FeePaid;
        this.isPremiumMember = isPremiumMember;
    }
    
    /**
     * Method for Fee Payment
     * @return Boolean isFeePaid
     */
    public boolean isFeePaid() {
        if (true){ 
            System.out.println("Thanks for the payment!");       
        } else {
            System.out.println("You have until the 29th of this month to pay. Remember Preimum Membership is $10 a month.");
        }
        return isFeePaid;
    }
    
    /**
     * Getter for is FeePaid
     * @return Boolean
     */
    public boolean GetIsFeePaid() {
        return isFeePaid;
    }
    
    /**
     * Setter for isFeePaid
     * @param isFeePaid Boolean
     */
    public void setIsFeePaid(boolean isFeePaid) {
        this.isFeePaid = isFeePaid;
    }
    
    /**
     * Method for isPremiumMember
     * @return isPremiumMember Boolean
     */
    public boolean isPremiumMember() {
        return isPremiumMember;
    }
    
    /**
     * Setter for isPremiumMember
     * @param isPremiumMember Boolean
     */
    public void setisPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }
    
    
     
}
