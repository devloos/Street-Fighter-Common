package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import edu.st.common.messages.MessageType;
import javafx.util.Pair;

public class MakeMove extends Message {
  public MakeMove(int row, int col) {
    super(MessageType.MakeMove);
    tile = new Pair<Integer, Integer>(row, col);
  }

  public Pair<Integer, Integer> getTile() {
    return tile;
  }

  public void setTitle(int row, int col) {
    tile = new Pair<Integer, Integer>(row, col);
  }

  private Pair<Integer, Integer> tile = null;
}
