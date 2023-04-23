package edu.st.common.messages.server;

import edu.st.common.messages.Message;

public class GameCreated extends Message {
  public GameCreated(int gameLobbyId) {
    this.gameLobbyId = gameLobbyId;
  }

  public int getGameLobbyId() {
    return gameLobbyId;
  }

  public void setGameLobbyId(int gameLobbyId) {
    this.gameLobbyId = gameLobbyId;
  }

  private int gameLobbyId = 0;
}
