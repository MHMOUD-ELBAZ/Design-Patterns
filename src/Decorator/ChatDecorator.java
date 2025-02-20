package Decorator;

public abstract class ChatDecorator implements IChatService {
    protected IChatService chatService;
    public ChatDecorator(IChatService chatService) {
        this.chatService = chatService;
    }

    @Override
    public String sendMessage(String message, int senderId, String chatId){
        return chatService.sendMessage(message,senderId,chatId);
    }

    @Override
    public String getMessage(String messageId, int senderId, String chatId){
        return chatService.getMessage(messageId,senderId,chatId);
    }

}
