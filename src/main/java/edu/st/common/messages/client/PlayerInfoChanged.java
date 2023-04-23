package edu.st.common.messages.client;

import edu.st.common.messages.Message;

public class PlayerInfoChanged extends Message {
  public PlayerInfoChanged(String avatarSelected) {
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
