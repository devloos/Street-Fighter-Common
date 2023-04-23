package com.dep.common.messages.server;

import com.dep.common.messages.GameResult;
import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;

public class GameEnded extends Message {
  public GameEnded(GameResult result) {
    super(MessageType.GameEnded);
    this.result = result;
  }

  public GameResult getGameResult() {
    return result;
  }

  public void setGameResult(GameResult result) {
    this.result = result;
  }

  private GameResult result = null;
}
