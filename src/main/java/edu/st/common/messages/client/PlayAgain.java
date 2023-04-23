package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class PlayAgain extends Message {
  public PlayAgain() {
    super(MessageType.PlayAgain);
  }
}
