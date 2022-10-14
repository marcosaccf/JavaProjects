/* Invoice.java
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Invoice {
   private String number;
    private String description;
    private int quantity;
    private double price;

    // construtor de Invoice que recebe quatro parâmetros
    public Invoice(String number, String description, int quantity, double price)
    {
        this.number = number;
        this.description = description;
        if (quantity > 0)
            this.quantity = quantity;
        if (price > 0.0)
            this.price = price;
    }

    public double getInvoiceAmount()
    {
        return quantity * price;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setQuantity(int quantity)
    {
        if(quantity > 0)
            this.quantity = quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }

    public void setPrice(double price)
    {
        if(price > 0.0)
            this.price = price;
    }

    public double getPrice()
    {
        return price;
    } 
}
