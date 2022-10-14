// Exercício 3.13: InvoiceTest.java
// Programa para teste da classe Invoice
package invoice;

import java.util.Scanner;

public class InvoiceTest
{
   public static void main(String[] args)
   {
        Invoice invoice = new Invoice( " ", " ", 0, 0.0 );
       
        Scanner input = new Scanner( System.in );
       
        String number;
        String description;
        int quantity;
        double price;
       
        System.out.print("Digite o número do item: ");
        number = input.nextLine();
        invoice.setPartNumber(number);
       
        System.out.print("Digite a descrição do item: ");
        description = input.nextLine();
        invoice.setPartDescription(description);
       
        System.out.print("Digite a quantidade do item: ");
        quantity = input.nextInt();
        if (quantity > 0)
            invoice.setQuantityOfItemPurchased(quantity);
       
        System.out.print("Digite o preço unitário do item: R$");
        price = input.nextDouble();
        if (price > 0)
            invoice.setPricePerItem(price);
       
        System.out.println();
       
        System.out.println("#     Descrição        Qde.        Preço Unit.      Total"); 
        System.out.printf( "%s    %s           %d          %.2f             %.2f\n",
                invoice.getPartNumber(),
                invoice.getPartDescription(),
                invoice.getQuantityOfItemPurchased(),
                invoice.getPricePerItem(),
                invoice.getInvoiceAmount());
   }
}
