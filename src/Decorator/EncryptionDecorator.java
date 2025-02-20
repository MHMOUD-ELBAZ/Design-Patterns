package Decorator;

public class EncryptionDecorator extends ChatDecorator {
    public EncryptionDecorator(IChatService chatService) {
        super(chatService);
    }

    @Override
    public String sendMessage(String message, int senderId, String chatId){
        String encrypted = encrypt(message);
        return chatService.sendMessage(encrypted,senderId,chatId);
    }

    @Override
    public String getMessage(String messageId, int senderId, String chatId) {
        String message = chatService.getMessage(messageId, senderId, chatId);

        if(message != null) {
            message = decrypt(message);
        }

        return message;
    }


    private String encrypt(String message){
        StringBuilder builder = new StringBuilder();

        for(char c : message.toCharArray())
            builder.append((char)(c+12));

        return builder.toString();
    }

    private String decrypt(String message){
        StringBuilder builder = new StringBuilder();
        for(char c : message.toCharArray()){
            builder.append((char)(c-12));
        }
        return builder.toString();
    }
}
