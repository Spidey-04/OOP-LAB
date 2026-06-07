public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("C-101", "Toyota", 3, 5000.0);
        Vehicle vehicle2 = new Bike("B-202", "Yamaha", 5, 200.0);

        System.out.println("--- Car Details ---");
        vehicle1.displayVehicleInfo();
        System.out.println("Total Cost: Rs. " + vehicle1.calculateRentalCost());

        System.out.println("\n--- Bike Details ---");
        vehicle2.displayVehicleInfo();
        System.out.println("Total Cost: Rs. " + vehicle2.calculateRentalCost());
    }
}