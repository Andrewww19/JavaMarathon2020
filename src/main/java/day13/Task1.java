package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Andrew");
        User user2 = new User("Max");
        User user3 = new User("Bob");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "How r u ?");
        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "I'm fine");
        user2.sendMessage(user1, "Ans u?");
        user3.sendMessage(user1, "Hellooooo:)");
        user3.sendMessage(user1, "My second message to Andrew");
        user3.sendMessage(user1, "Goodbye!");
        user1.sendMessage(user3, "hi;)");
        user1.sendMessage(user3, "second user1 -> user3");
        user1.sendMessage(user3, "third user1 -> user3");
        user3.sendMessage(user1, "bla-bla-bla!");

        MessageDatabase.showDialog(user1, user3);
    }
}
