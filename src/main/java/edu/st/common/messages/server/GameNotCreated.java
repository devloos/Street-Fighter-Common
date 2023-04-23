package edu.st.common.messages.server;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class GameNotCreated extends Message {
  public GameNotCreated() {
    super(MessageType.GameNotCreated);
  }
}
