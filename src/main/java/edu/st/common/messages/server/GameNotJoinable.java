package edu.st.common.messages.server;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class GameNotJoinable extends Message {
  public GameNotJoinable() {
    super(MessageType.GameNotjoinable);
  }
}
