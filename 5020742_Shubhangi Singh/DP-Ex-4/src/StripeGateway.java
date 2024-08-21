public class StripeGateway {
    public void chargeCard(String paymentMethod, double amount) {
        System.out.println("Charging card with Stripe: " + paymentMethod + ", Amount: " + amount);
    }
}