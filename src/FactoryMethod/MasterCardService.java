package FactoryMethod;

public class MasterCardService extends PaymentService{
    @Override
    protected IPaymentGateway paymentGatewayCreator() {
        return new MasterCardGateway();
    }
}
