/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramirezbrianproject3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author brianramirez
 */
public class BookStore {

    /**
     * Array List for Inventory
     */
    protected ArrayList<Product> Inventory = new ArrayList<>();
    private int numSales;
    private static int dayNum = 1;
    private double moneySpent = 0;
    public int MembersRegistered; 
    private String position;
    
    Members member = new Members();
    PremiumMembers info = new PremiumMembers();
    
    public BookStore(){
        
    }
    
    /**
     * Constructor for BookStore
     *
     * @param filename String
     */
    public BookStore(String filename) {
        newDay();
        generateInventory(filename);
    }

    /**
     * Getter for ArrayList Inventory
     *
     * @return
     */
    public ArrayList<Product> getInventory() {
        System.out.println(Inventory.toString());
        return Inventory;
    }
    
    /**
     * Getter for numSales
     *
     * @return numSales
     */
    public int getNumSales() {
        return numSales;
    }

    /**
     * Method to addSales
     *
     * @param numPurchases int
     */
    public void addSales(int numPurchases) {
        numSales += numPurchases;
    }

    /**
     * Method for a newDay
     */
    private void newDay() {
        numSales = 0;
    }

    /**
     * Method for totalSpent
     *
     * @param numSpent double
     */
    public void totalSpent(double numSpent) {
        moneySpent += numSpent;
    }

    /**
     * Getter for MoneySpent
     *
     * @return moneySpent
     */
    public double getMoneySpent() {
        return moneySpent;
    }

    /**
     * Setter for moneySpent
     *
     * @param moneySpent double
     */
    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    /**
     * Method for adding to Inventory Array List
     *
     * @param IDnum int
     * @param PType String
     * @param Pname String
     * @param Artist String
     * @param Price double
     * @param StockNum int
     */
    public void addInventory(int IDnum, String PType, String Pname, String Artist, double Price, int StockNum) {
        Inventory.add(new Product(IDnum, PType, Pname, Artist, StockNum, Price) {
        });
        System.out.println("Thank you. You have added the following to our Inventory:");
        System.out.println("ID: " + IDnum + " Product Type: " + PType + " Product Name: " + Pname + "\nProduct Artist/Author " + Artist + " Product price " + Price + " Stock Number: " + StockNum);
    }

    /**
     * Method for InventorySize
     *
     * @return ArrayList Size
     */
    public int InventorySize() {
        return Inventory.size();
    }

    /**
     * Method for CheckingInventory Prints out contents of Inventory
     */
    public void CheckInventory() {
        System.out.print(Inventory.toString());
    }

    /**
     * Method for generating Inventory
     *
     * @param filename String
     */
    private void generateInventory(String filename) {
        File inventoryFile = new File(filename);
        Scanner scnr;

        try {
            scnr = new Scanner(inventoryFile);
            scnr.nextLine();

            while (scnr.hasNext()) {
                String line = scnr.nextLine();
                String[] products = line.split(",");
                int id = Integer.parseInt(products[0]);
                String type = products[1];

                if (type.equalsIgnoreCase("CD")) {
                    addCDs(line);
                } else if (type.equalsIgnoreCase("DVD")) {
                    addDVDs(line);
                } else if (type.equalsIgnoreCase("Book")) {
                    addBooks(line);
                } else {
                    System.out.println("Invalid product type");
                }
            }
            scnr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Exception with inventory file");
            System.out.println(e);
        }

    }

    /**
     * Method to addCDS
     *
     * @param line String
     */
    private void addCDs(String line) {
        String[] products = line.split(",");
        int productID = Integer.parseInt(products[0]);
        String type = products[1];
        String title = products[2];
        String artist = products[3];
        int inStock = Integer.parseInt(products[4]);
        double price = Double.parseDouble(products[5]);
        Inventory.add(new CDs(productID, type, title, artist, inStock, price));
        System.out.println("CD " + title + " has been added to your inventory");
    }

    /**
     * Method to addDVDs
     *
     * @param line String
     */
    private void addDVDs(String line) {
        String[] products = line.split(",");
        int productID = Integer.parseInt(products[0]);
        String type = products[1];
        String title = products[2];
        String artist = products[3];
        int inStock = Integer.parseInt(products[4]);
        double price = Double.parseDouble(products[5]);
        Inventory.add(new DVDs(productID, type, title, artist, inStock, price));
        System.out.println("DVD " + title + " has been added to your inventory");
    }

    /**
     * Method to addBooks
     *
     * @param line String
     */
    private void addBooks(String line) {
        String[] products = line.split(",");
        int productID = Integer.parseInt(products[0]);
        String type = products[1];
        String title = products[2];
        String artist = products[3];
        int inStock = Integer.parseInt(products[4]);
        double price = Double.parseDouble(products[5]);
        Inventory.add(new Books(productID, type, title, artist, inStock, price));
        System.out.println("Book " + title + " has been added to your inventory");
    }

    /**
     * Method to generate endDay report
     */
    public void endDay() {
        try {
            FileOutputStream fs = new FileOutputStream("EndDayReport.txt");
            PrintWriter outFS = new PrintWriter(fs);
            outFS.println("We did a total of " + numSales + " transactions today");
            outFS.println("We generated an income of $" + moneySpent);
            outFS.println("We registered a total of " + MembersRegistered + " new members today."); 
            outFS.println("Name of products sold: " + position);
            outFS.flush();
            fs.close();

            FileOutputStream fs2 = new FileOutputStream("ProductInventory-Day" + dayNum + ".csv");
            PrintWriter outFS2 = new PrintWriter(fs2);
            outFS2.println("Productname,id,price,inStock");

            for (Product a : Inventory) {
                outFS2.print(a.getProductID() + "," + a.getClass().getSimpleName() + "," + a.getProductName() + ",");
                outFS2.print(a.getArtist() + "," + a.getProductPrice() + "," + a.getStockNum());
                outFS2.println();
            }
            outFS2.flush();
            fs2.close();
        } catch (FileNotFoundException e) {
            System.out.println("exception: FIle not found");
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("exception: problem closing file");
            System.out.println(e);
        }
    }

    /**
     * Method to Purchase an Item
     */
    public void purchaseItem() {

        Scanner sc = new Scanner(System.in);
        double moneyTotal = 0;
        boolean authorized;
        boolean members;
        double lifeTime = 0;
        String product = null;
      
       
        
        try {
            authorized = true;
            while (authorized) {
                System.out.println("Make sure to Enter Product ID of a # 1-15.");
                int ID = sc.nextInt();
                moneyTotal += Inventory.get(ID - 1).getProductPrice();
                lifeTime += Inventory.get(ID - 1).getProductPrice();
                System.out.println("Title: " + Inventory.get(ID - 1).getProductName() + " is on your order!");
                position = Inventory.get(ID - 1).getProductName();
                
                System.out.println("Total Price: " + moneyTotal);
                

                setMoneySpent(moneyTotal);
                

                System.out.println("Are you done shopping?");
                System.out.println("\t1. Yes");

                System.out.println("\t2. No");

                numSales++;

                int doneShopping = sc.nextInt();
                if (doneShopping == 1) {
                    //   store.addSales(purchases.size());
                    System.out.println("Please wait, one moment... Transfering to Checkout");
                    System.out.println("Please enter First Name");
                    String FName = sc.next();
                    member.setFirstName(FName);
                    System.out.println("Please enter last Name");
                    String LName = sc.next();
                    member.setLastName(LName);

                    System.out.println("\nTotal for today is: " + lifeTime);
                    System.out.println("Thanks. Will that be Card or Money? Type either C or M.");
                    char character = sc.next().charAt(0);
                    if (character == 'C' || character == 'c') {
                        System.out.println("Debit or Credit? (Type which)");
                        String Payment = sc.next();
                        member.setPaymentMethod(Payment);
                    } else if (character == 'M' || character == 'm') {
                        System.out.println("Full amount must be in cash, please hit enter.");
                        String Payment = sc.next();
                        member.setPaymentMethod(Payment);
                    } else {
                        System.out.println("Sorry, but only Card and Money are accepted. Re-try again.");
                        break;
                    }
                    System.out.println("\nPremium Member? (Y/N)");
                    char letter = sc.next().charAt(0);
                    boolean Pmember = false;
                    if (letter == 'Y' || letter == 'y') {
                        Pmember = true;
                    } else {
                        Pmember = false;
                    }
                    if (Pmember == true) {
                        System.out.println("Please enter Premium Member ID");
                        int iD = sc.nextInt();
                        member.setId(iD);
                        System.out.println("Have you paid your fee? (TYPE Y/N)");
                        char let = sc.next().charAt(0);
                        boolean fee = false;
                        if (letter == 'Y' || letter == 'y') {
                            fee = true;
                        } else {
                            fee = false;
                            System.out.println("Remember the fee of $15 is due on the 29th.");
                        }
                        info.setIsFeePaid(fee);
                        System.out.println("***Customer Information***" + "\nFirstName: " + FName + "\nLastName: " + LName + "\nPayment method: " + member.getPaymentMethod());
                        if (Pmember == true) {
                        System.out.println("Premium Member ID: " + member.getId());
                      }
                    }
                                            System.out.println("***Customer Information***" + "\nFirstName: " + FName + "\nLastName: " + LName + "\nPayment method: " + member.getPaymentMethod());
                    System.out.println("\nThank you. Come again.");
                    break;
                    
                    
                } else if (doneShopping == 2) {
                    authorized = true;
                } else {
                    System.out.println("Sorry, try again.");
                }
                //        authorized = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("exception: InputMismatch");
        }

    }

    /**
     * Method to print out all field values
     *
     * @return
     */
    @Override
    public String toString() {
        return "BookStore{" + "Inventory=" + Inventory + ", numSales=" + numSales + ", moneySpent=" + moneySpent + ", membersRegisted=" + '}';
    }
}             