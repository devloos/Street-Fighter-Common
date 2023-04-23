package edu.st.common.messages.client;

import edu.st.common.messages.Message;

public class PlayerInfoConfirmed extends Message {
  public PlayerInfoConfirmed(String username, String avatarSelected) {
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
