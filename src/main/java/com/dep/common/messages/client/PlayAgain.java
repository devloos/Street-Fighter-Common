package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class PlayAgain extends Message {
  public PlayAgain() {
    super(MessageType.PlayAgain);
  }
}
