package edu.st.common.messages;

import java.io.Serializable;

public class Message implements Serializable {
  private String type;

  public Message() {
    this.type = this.getClass().getName();
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Message{" +
        "type='" + type + '\'' +
        '}';
  }
}
