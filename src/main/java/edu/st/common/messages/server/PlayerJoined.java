package edu.st.common.messages.server;

import edu.st.common.messages.Message;

public class PlayerJoined extends Message {
  public PlayerJoined(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  private String username = null;
}
