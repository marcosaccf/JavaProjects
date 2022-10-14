// Exercício 3.13: Invoice.java
// classe Invoice
package invoice;

public class Invoice
{
    private String partNumber;
    private String partDescription;
    private int quantityOfItemPurchased;
    private double pricePerItem;
    
    public Invoice( String number, String description, int quantity, double price )
    {
        partNumber = number;
        partDescription = description;
        quantityOfItemPurchased = quantity;
        pricePerItem = price;
    }
    
    public void setPartNumber( String number )
    {
        partNumber = number;
    }
    
    public void setPartDescription( String description )
    {
        partDescription = description;
    }
    
    public void setQuantityOfItemPurchased( int quantity )
    {
        quantityOfItemPurchased = quantity;
    }
    
    public void setPricePerItem( double price )
    {
        pricePerItem = price;
    }
    
    public String getPartNumber()
    {
        return partNumber;
    }
    
    public String getPartDescription()
    {
        return partDescription;
    }
    
    public int getQuantityOfItemPurchased()
    {
        return quantityOfItemPurchased;
    }
    
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    
    public double getInvoiceAmount()
    {
        double totalAmount;
        totalAmount = quantityOfItemPurchased * pricePerItem;
        return totalAmount;
    }
} // fim da classe Invoice
