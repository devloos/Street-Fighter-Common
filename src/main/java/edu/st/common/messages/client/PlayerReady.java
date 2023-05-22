package edu.st.common.messages.client;

import edu.st.common.messages.Message;

public class PlayerReady extends Message {
  private String avatarSelected = null;

  public PlayerReady() {
  }

  public PlayerReady(String avatarSelected) {
    this.avatarSelected = avatarSelected;
  }

  public String getAvatarSelected() {
    return avatarSelected;
  }

  public void setAvatarSelected(String avatarSelected) {
    this.avatarSelected = avatarSelected;
  }
}
