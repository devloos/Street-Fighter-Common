package edu.st.common.messages.client;

import edu.st.common.messages.Message;

public class CreateGame extends Message {
  public CreateGame(String username) {
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
