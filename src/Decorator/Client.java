package Decorator;

public class Client {
    public static void main(String[] args) {
        IChatService chat = new ChatService();

        chat = new CashingDecorator(chat);
        chat = new EncryptionDecorator(chat);

        String id = chat.sendMessage("hello", 1,"jew-rfe");

        System.out.println(chat.getMessage(id,1,"jew-rfe"));
    }
}
