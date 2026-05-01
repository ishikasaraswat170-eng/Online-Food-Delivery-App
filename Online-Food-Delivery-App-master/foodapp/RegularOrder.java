package foodapp;
public class RegularOrder extends Order 
{
    public RegularOrder(int orderId, double baseAmount)
	{
        super(orderId, baseAmount);
    }
    @Override
    public double calculateBill() 
	{
        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Base Amount: " + baseAmount);
        System.out.println("Discount: 0");
        System.out.println("Delivery Charge: " + deliveryCharge);
        double subtotal = baseAmount + deliveryCharge;
        double gst = subtotal * GST_RATE;
        System.out.println("GST (18%): +" + gst);
        return subtotal + gst;
    }
}