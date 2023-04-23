package com.dep.common.messages.client;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;
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
