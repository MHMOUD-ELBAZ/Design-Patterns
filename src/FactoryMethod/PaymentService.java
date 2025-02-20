package FactoryMethod;

public abstract class PaymentService {

    public void processPayment(String from, String to, double amount) {
        IPaymentGateway paymentGateway = paymentGatewayCreator();
        paymentGateway.transfer(from, to, amount);
    }

    //Can handle any additional logic for creating a Gateway
    protected abstract IPaymentGateway paymentGatewayCreator ();
}
