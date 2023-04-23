package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class PlayerReady extends Message {
  public PlayerReady() {
    super(MessageType.PlayerReady);
  }
}
