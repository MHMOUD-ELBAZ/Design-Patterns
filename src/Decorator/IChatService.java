package Decorator;

public interface IChatService {
    String sendMessage(String message, int senderId, String chatId);
    String getMessage(String messageId, int senderId, String chatId);
}
