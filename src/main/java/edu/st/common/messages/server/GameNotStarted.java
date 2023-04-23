package edu.st.common.messages.server;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class GameNotStarted extends Message {
    public GameNotStarted() {
        super(MessageType.GameNotStarted);
    }
}
