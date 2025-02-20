package FactoryMethod;

public class PayPalService extends PaymentService {
    @Override
    protected IPaymentGateway paymentGatewayCreator(){
        return new PayPalGateway();
    }
}
