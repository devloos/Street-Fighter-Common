package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class PlayerReady extends Message {
  public PlayerReady() {
    super(MessageType.PlayerReady);
  }
}
