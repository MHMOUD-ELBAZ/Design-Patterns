package FactoryMethod;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PayPalService();
        paymentService.processPayment("0d32wfe5555w", "02121rreg4yy", 230.89);

        paymentService = new MasterCardService();
        paymentService.processPayment("03gigt76ryf67", "6541jyfrf69", 660.66);

    }
}
