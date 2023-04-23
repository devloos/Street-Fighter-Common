package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class PlayerInfoChanged extends Message {
  public PlayerInfoChanged(String avatarSelected) {
    super(MessageType.PlayerInfoChanged);
    this.avatarSelected = avatarSelected;
  }

  public String getAvatarSelected() {
    return avatarSelected;
  }

  public void setAvatarSelected(String avatarSelected) {
    this.avatarSelected = avatarSelected;
  }

  private String avatarSelected = null;
}
