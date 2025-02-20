package FactoryMethod;

public interface IPaymentGateway {
    boolean checkAccount(String account);
    boolean hasEnoughMoney(String account, double amount);
    void transfer(String from, String to, double amount);
}
