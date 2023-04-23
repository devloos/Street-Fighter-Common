package edu.st.common.messages.server;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class GameStarted extends Message {
    public GameStarted() {
        super(MessageType.GameStarted);
    }
}
