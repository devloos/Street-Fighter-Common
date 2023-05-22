package edu.st.common.messages.client;

import edu.st.common.messages.Message;

public class PlayerAvatarChange extends Message {
  private String avatarSelected = null;

  public PlayerAvatarChange() {
  }

  public PlayerAvatarChange(String avatarSelected) {
    this.avatarSelected = avatarSelected;
  }

  public String getAvatarSelected() {
    return avatarSelected;
  }

  public void setAvatarSelected(String avatarSelected) {
    this.avatarSelected = avatarSelected;
  }
}
