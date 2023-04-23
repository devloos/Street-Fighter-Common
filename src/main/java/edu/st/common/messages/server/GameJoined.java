package edu.st.common.messages.server;

import edu.st.common.messages.Message;

public class GameJoined extends Message {
  public GameJoined(String hostUsername) {
    this.hostUsername = hostUsername;
  }

  public String getHostUsername() {
    return hostUsername;
  }

  public void setHostUsername(String hostUsername) {
    this.hostUsername = hostUsername;
  }

  private String hostUsername = null;
}
