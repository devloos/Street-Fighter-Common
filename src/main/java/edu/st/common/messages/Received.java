package edu.st.common.messages;

public class Received extends Message {
  public Received(boolean success) {
    this.success = success;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  private boolean success = false;
}
