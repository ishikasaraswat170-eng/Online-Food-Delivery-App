package foodapp;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Base Amount: ");
        double amount = sc.nextDouble();
        if (amount <= 0) 
		{
            System.out.println("Invalid amount. Bill amount must be positive.");
            sc.close();
            return;
        }
        Order order;
        if (amount > 2000) 
		{
            order = new PremiumOrder(id, amount);
        } else 
		{
            order = new RegularOrder(id, amount);
        }
        double finalBill = order.calculateBill();
        System.out.println("\nFinal Payable Amount: " + finalBill);
        sc.close();
    }
}