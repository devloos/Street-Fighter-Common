package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

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
