public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();
        
        double baseCharge = 200.0;

        System.out.println("Base Charge only: Rs. " + calculator.calculateCharge(baseCharge));
        System.out.println("Base + Distance (5km): Rs. " + calculator.calculateCharge(baseCharge, 5.0));
        System.out.println("Base + Distance (5km) + Weight (2kg): Rs. " + calculator.calculateCharge(baseCharge, 5.0, 2.0));
        System.out.println("Base + Express Delivery: Rs. " + calculator.calculateCharge(baseCharge, true));
    }
}