package foodapp;
public class PremiumOrder extends Order 
{
    private static final double PREMIUM_LIMIT = 2000;
    private static final double DISCOUNT_RATE = 0.20;

    public PremiumOrder(int orderId, double baseAmount) 
	{
        super(orderId, baseAmount);
    }
    @Override
    public double calculateBill() 
	{
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Base Amount: " + baseAmount);
        double discountedAmount = baseAmount;
        if (baseAmount >= PREMIUM_LIMIT) 
		{
            double discount = baseAmount * DISCOUNT_RATE;
            discountedAmount = baseAmount - discount;
            System.out.println("Discount (20%): -" + discount);
            System.out.println("Delivery Charge: 0 (Free Delivery)");
            System.out.println("\nPremium Benefits Applied");
        } 
		else 
		{
            System.out.println("Discount: 0");
            System.out.println("Delivery Charge: " + deliveryCharge);
            discountedAmount = baseAmount + deliveryCharge;
        }
        double gst = discountedAmount * GST_RATE;
        System.out.println("GST (18%): +" + gst);
        return discountedAmount + gst;
    }
}