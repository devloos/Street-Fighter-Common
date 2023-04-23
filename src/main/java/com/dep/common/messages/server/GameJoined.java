package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class GameJoined extends Message {
  public GameJoined(String hostUsername) {
    super(MessageType.GameJoined);
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
