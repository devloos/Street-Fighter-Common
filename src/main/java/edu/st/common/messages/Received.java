package edu.st.common.messages;

public class Received extends Message {
  private boolean success = false;

  public Received() {
    super();
    this.success = false;
  }

  public Received(boolean success) {
    super();
    this.success = success;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  @Override
  public String toString() {
    return "Received{" +
        "success=" + success +
        '}';
  }
}
