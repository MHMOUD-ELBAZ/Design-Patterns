package Decorator;

import java.util.HashMap;
import java.util.Map;

public class CashingDecorator extends ChatDecorator{
    //simulate any cashing service
    private Map<String, String> messages;

    public CashingDecorator(IChatService chatService) {
        super(chatService);
        messages = new HashMap<String, String>();
    }

    @Override
    public String sendMessage(String message, int senderId, String chatId){
        String messageId = chatService.sendMessage(message,senderId,chatId);

        messages.put(messageId,message);

        return messageId;
    }

    @Override
    public String getMessage(String messageId, int senderId, String chatId){
        if(messages.containsKey(messageId))
            return messages.get(messageId);

        return chatService.getMessage(messageId,senderId,chatId);
    }
}
