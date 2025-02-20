package Decorator;

import java.util.*;

public class ChatService implements IChatService {
    //DB simulation userId -> {chat{messageId -> message}}
    private TreeMap<Integer, Map<String,Map<String, String>>> chats;

    public ChatService() {
        chats = new TreeMap<>();
    }

    @Override
    public String sendMessage(String message, int senderId, String chatId) {
        if(!chats.containsKey(senderId))
            chats.put(senderId, new TreeMap<>());

        Map<String,Map<String, String>> chats = this.chats.get(senderId);

        if(!chats.containsKey(chatId))
            chats.put(chatId, new HashMap<>());

        String messageId = UUID.randomUUID().toString();
        chats.get(chatId).put(messageId, message);

        return messageId;
    }

    @Override
    public String getMessage(String messageId, int senderId, String chatId) {
        if(!chats.containsKey(senderId)) return null;

        Map<String,Map<String, String>> chats = this.chats.get(senderId);
        if(!chats.containsKey(chatId)) return null;

        if(!chats.get(chatId).containsKey(messageId))
            return null;

        return chats.get(chatId).get(messageId);
    }

}
