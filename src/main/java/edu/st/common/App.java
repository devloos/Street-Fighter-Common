package edu.st.common;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Message message = new Message(MessageType.AvatarSelectionStarted);
        System.out.println("Hello World!");
    }
}
