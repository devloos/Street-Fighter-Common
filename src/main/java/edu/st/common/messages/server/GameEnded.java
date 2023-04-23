package edu.st.common.messages.server;

import edu.st.common.messages.GameResult;
import edu.st.common.messages.Message;

public class GameEnded extends Message {
  public GameEnded(GameResult result) {
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
