package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class GameNotCreated extends Message {
  public GameNotCreated() {
    super(MessageType.GameNotCreated);
  }
}
