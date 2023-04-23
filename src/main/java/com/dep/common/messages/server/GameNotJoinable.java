package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class GameNotJoinable extends Message {
  public GameNotJoinable() {
    super(MessageType.GameNotjoinable);
  }
}
