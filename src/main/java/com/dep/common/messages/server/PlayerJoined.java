package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class PlayerJoined extends Message {
  public PlayerJoined(String username) {
    super(MessageType.PlayerJoined);
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
