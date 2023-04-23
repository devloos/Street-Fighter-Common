package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class GameNotStarted extends Message {
    public GameNotStarted() {
        super(MessageType.GameNotStarted);
    }
}
