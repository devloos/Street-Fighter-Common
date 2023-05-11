package edu.st.common.messages;

public class Received extends Message {
  private boolean success = false;

  public Received() {
  }

  public Received(boolean success) {
    this.success = success;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }
}
