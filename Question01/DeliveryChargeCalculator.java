class DeliveryChargeCalculator {

    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        double distanceCharge = distanceKm * 100.0;
        return baseCharge + distanceCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        double distanceCharge = distanceKm * 100.0;
        double weightCharge = weightKg * 50.0;
        return baseCharge + distanceCharge + weightCharge;
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        }
        return baseCharge;
    }
}
