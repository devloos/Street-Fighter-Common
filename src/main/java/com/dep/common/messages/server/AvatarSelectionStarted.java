package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class AvatarSelectionStarted extends Message {
  public AvatarSelectionStarted(String username) {
    super(MessageType.AvatarSelectionStarted);
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
