package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class PlayerInfoConfirmed extends Message {
  public PlayerInfoConfirmed(String username, String avatarSelected) {
    super(MessageType.PlayerInfoConfirmed);
    this.username = username;
    this.avatarSelected = avatarSelected;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getAvatarSelected() {
    return avatarSelected;
  }

  public void setAvatarSelected(String avatarSelected) {
    this.avatarSelected = avatarSelected;
  }

  private String username = null;
  private String avatarSelected = null;
}
