package com.dep.common;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

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
