package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class SubscribeGameList extends Message {
  public SubscribeGameList() {
    super(MessageType.SubscribeGameList);
  }
}
