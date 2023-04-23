package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class BackToMainMenu extends Message {
  public BackToMainMenu() {
    super(MessageType.BackToMainMenu);
  }
}
