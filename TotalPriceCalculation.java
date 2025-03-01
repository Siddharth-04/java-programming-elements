import java.util.Scanner;

public class TotalPriceCalculation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of the item : ");
        double unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity of item : ");
        int quantity = input.nextInt();
        
        double totalPrice = unitPrice * quantity;
        
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and the unit price is INR " + unitPrice);
    }
}