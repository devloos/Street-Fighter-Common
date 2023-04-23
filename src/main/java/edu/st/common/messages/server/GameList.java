package edu.st.common.messages.server;

import java.util.ArrayList;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;

public class GameList extends Message {
  public GameList(ArrayList<Integer> lobbyIds) {
    super(MessageType.GameList);
    this.lobbyIds = lobbyIds;
  }

  public ArrayList<Integer> getLobbyIds() {
    return lobbyIds;
  }

  public void setLobbyIds(ArrayList<Integer> lobbyIds) {
    this.lobbyIds = lobbyIds;
  }

  private ArrayList<Integer> lobbyIds = null;
}
