package Invoice;

public class InvoiceTest 
{
    public static void main(String[] args)
    {
        Invoice invoice1 = new Invoice("321-56", "Mouse", 2, 7.50);
        Invoice invoice2 = new Invoice("321-57", "Teclado", 1, 15.00);
        
        System.out.printf("FATURA 1%nNúmero: %s%nDescrição: %s%nQuantidade: %d%nPreço: $ %.2f%nTotal: $ %.2f%n%n",
        invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPrice(), invoice1.getInvoiceAmount());

        System.out.printf("FATURA 1%nNúmero: %s%nDescrição: %s%nQuantidade: %d%nPreço: $ %.2f%nTotal: $ %.2f%n%n",
        invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPrice(), invoice2.getInvoiceAmount());
    }
}