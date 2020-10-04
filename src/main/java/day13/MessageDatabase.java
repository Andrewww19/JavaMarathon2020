package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        List<Message> dialog = new ArrayList<>();
        dialog = messages.stream()
                .filter(message -> message.getSender().equals(u1) || message.getSender().equals(u2))
                .filter(message -> message.getReceiver().equals(u1) || message.getReceiver().equals(u2))
                .collect(Collectors.toList());
        dialog.forEach(message -> System.out.println(message.getSender().getUserName() 
                + ": " + message.getText()));
    }
}
