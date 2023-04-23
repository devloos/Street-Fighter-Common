package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class SubscribeGameList extends Message {
  public SubscribeGameList() {
    super(MessageType.SubscribeGameList);
  }
}
