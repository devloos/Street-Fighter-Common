package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class CreateGame extends Message {
  public CreateGame(String username) {
    super(MessageType.CreateGame);
    this.username = username;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  private String username = null;
}
