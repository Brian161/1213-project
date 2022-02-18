/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramirezbrianproject3;

import java.util.ArrayList;

/**
 *
 * @author brianramirez
 */
public class Members {

    /**
     * Array List for Members
     */
    private ArrayList<Members> Member = new ArrayList<>();
    private int id;
    private String firstName;
    private String lastName;
    private String paymentMethod;
    protected double lifeTime;
    
    

    /**
     * Blank Constructor
     */
    public Members() {
    }
   
    /**
     * Constructor that sets each equal to
     *
     * @param id int
     * @param fName String
     * @param lName String
     */
    public Members(int id, String fName, String lName) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
    }

    /**
     * Constructor for Members
     *
     * @param id Int
     * @param fName String
     * @param lName String
     * @param paymentMethod String
     * @param moneySpent Double
     */
    public Members(int id, String fName, String lName, String paymentMethod, double lifeTime) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.paymentMethod = paymentMethod;
        this.lifeTime = lifeTime;

    }
    
            
    /**
     * Getter for ArrayList<Members>
     *
     * @return Member
     */
    public ArrayList<Members> getMember() {
        return Member;
    }

    /**
     * Setter for ArrayList<Members>
     *
     * @param Member ArrayList
     */
    public void setMember(ArrayList<Members> Member) {
        this.Member = Member;
    }
    
    /**
     * Getter that gets ID
     *
     * @return id number
     */
    public int getId() {

        return id;

    }

    /**
     * method that sets id number
     *
     * @param id number that is an int
     */
    public void setId(int id) {

        this.id = id;

    }

    /**
     * Method that gets the First Name
     *
     * @return First Name
     */
    public String getFirstName() {

        return firstName;

    }

    /**
     * Method that sets First Name
     *
     * @param firstName that is a string
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    /**
     * Method that gets last name
     *
     * @return last name that is a string
     */
    public String getLastName() {

        return lastName;

    }

    /**
     * Method that sets Last Name
     *
     * @param lastName that is a string
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    /**
     * Method to get the PaymentMethod
     *
     * @return PaymentMethod that is a string
     */
    public String getPaymentMethod() {

        return paymentMethod;

    }

    /**
     * method to setPaymentMethod
     *
     * @param paymentMethod that is a String
     */
    public void setPaymentMethod(String paymentMethod) {

        this.paymentMethod = paymentMethod;
    }

    /**
     * method to get the Money Spent
     *
     * @return lifeTime
     */
    public double getlifeTime() {

        return lifeTime;

    }

    /**
     * Method to set the total Life Time spent
     *
     * @param lifeTime that is a double
     */
    public void setlifeTime(double lifeTime) {

        this.lifeTime = lifeTime;
    }

    /**
     * Method that adds member to array list
     *
     * @param id int
     * @param fName String
     * @param lName String
     */
    public void addMember(int id, String fName, String lName) {
     //   MembersRegistered++;
    //    this.setMembersRegistered(MembersRegistered +1);
        
        Member.add(new Members(id, fName, lName));
        System.out.println("\n Congratulations! Member " + fName + " has now been added.");
      //  System.out.println(MembersRegistered);
       
    }

    /**
     * Method that adds Members to Array List
     *
     * @param name Members
     * @return true
     */
    public boolean addMember(Members name) {
        Member.add(name);
        System.out.println("Member " + name.getFirstName() + " has now been added.");
        return true;
    }

    /**
     * Method for removing Members from Array List
     *
     * @param name Members
     * @return false
     */
    public boolean removeMember(Members name) {

        for (int x = 0; x < Member.size(); x++) {

            if (Member.get(x) == name) {

                Member.remove(x);
                System.out.println("Member " + name.getFirstName() + name.getLastName() + " has now been removed.");
                System.out.println();
            } else {
                System.out.println("Sorry, but that Member is not listed.");
                System.out.println();
            }

        }
        return false;
    }

    /**
     * Method that prints out all the fields names and their current values
     *
     * @return int ID, String firstName, String lastName
     */
    @Override
    public String toString() {
        return "\nMembers: " + "ID Number : " + id + ", FirstName: " + firstName + ", LastName: " + lastName;
    }

}
