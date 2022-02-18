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
public abstract class Product {
    
    private int ProductID;
    private String ProductType;
    private String ProductName;
    private String Artist;
    private double ProductPrice;
    private int StockNum;
    
    
    public Product(){
        
    }
    /**
     * Constructor for Product  
     * @param Pname String
     * @param IDnum int
     * @param Price double
     * @param StockNum int
     */
    public Product(int IDnum, String PType, String Pname, String Artist, int StockNum, double Price){
        this.ProductID = IDnum;
        this.ProductType = PType;
        this.ProductName = Pname;
        this.Artist = Artist;
        this.StockNum = StockNum;
        this.ProductPrice = Price;
    }
    /**
     * Getter for ProductName 
     * @return ProductName
     */
    public String getProductName() {
        return ProductName;
    }
    
    /**
     * Setter for ProductName
     * @param ProductName
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    
    /**
     * Getter for ProductID
     * @return ProductID 
     */
    public int getProductID() {
        return ProductID;
    }
    
    /**
     * Setter for ProductID
     * @param int ProductID 
     */
    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }
    
    /**
     * Getter for ProductPrice
     * @return ProductPrice
     */
    public double getProductPrice() {
        return ProductPrice;
    }
    
    /**
     * Setter for ProductPrice
     * @param ProductPrice double 
     */
    public void setProductPrice(double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }
    /**
     * Getter for Artist
     * @return Artist
     */
    public String getArtist() {
        return Artist;
    }
    /**
     * Setter for Artist
     * @param Artist String 
     */
    public void setArtist(String Artist) {
        this.Artist = Artist;
    }
    
    /**
     * Getter for StockNum
     * @return StockNum
     */
    public int getStockNum() {
        return StockNum;
    }
    
    /**
     * Setter for StockNum 
     * @param StockNum int
     */
    public void setStockNum(int StockNum) {
        this.StockNum = StockNum;
    }
    /**
     * Getter for ProductType
     * @return ProductType
     */
    public String getProductType() {
        return ProductType;
    }
    /**
     * Setter for ProductType
     * @param ProductType String 
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }
    
    
    /**
     * Method to Decrement Stock
     */
    public void DecrementStock(){
        this.StockNum = this.StockNum - 1;
    }
    
    /**
     * Method that Increments Stock
     */
    public void IncrementStock() {      
       this.StockNum = this.StockNum + 1;    
    }
       
}
