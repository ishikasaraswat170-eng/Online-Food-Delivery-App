package foodapp;
public class Order
{
    protected int orderId;
    protected double baseAmount;
    public static double deliveryCharge = 40;
    public static final double GST_RATE = 0.18;
    public Order(int orderId, double baseAmount)
	{
        this.orderId=orderId;
        this.baseAmount=baseAmount;
    }
    public double calculateBill() 
	{
        return baseAmount+deliveryCharge;
    }
}