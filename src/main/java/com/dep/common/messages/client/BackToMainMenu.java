package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class BackToMainMenu extends Message {
  public BackToMainMenu() {
    super(MessageType.BackToMainMenu);
  }
}
