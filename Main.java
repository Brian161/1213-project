/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramirezbrianproject3;

/**
 *
 * @author brianramirez
 */
public class Main {

    /**
     * Main method 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BookStore myMode1 = new BookStore();
        Product myMode2 = new Product() {};
        Members myMode3 = new Members();
        PremiumMembers myMode4 = new PremiumMembers();        
        PurchaseFrame myPurchaseFrame = new PurchaseFrame(myMode1, myMode2, myMode3, myMode4);
        myPurchaseFrame.setVisible(true);    
       

    }                    
}
