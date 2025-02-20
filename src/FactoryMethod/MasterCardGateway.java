package FactoryMethod;

public class MasterCardGateway implements IPaymentGateway{
    @Override
    public boolean checkAccount(String account) {
        System.out.println("Account " + account + " is being checked in Master Card Servers");
        return true;
    }

    @Override
    public boolean hasEnoughMoney(String account, double amount) {
        if(checkAccount(account))
            System.out.println("Checking if " + account + " has enough money");

        return true;
    }

    @Override
    public void transfer(String from, String to, double amount) {
        if(hasEnoughMoney(from, amount) && checkAccount(to))
            System.out.println("Transferring to " + to + " from " + from + " amount = " + amount + "...");
        System.out.println("Transaction completed using Master card");
    }
}
