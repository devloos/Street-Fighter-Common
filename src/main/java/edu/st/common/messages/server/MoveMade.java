package edu.st.common.messages.server;

import edu.st.common.messages.Message;
import javafx.util.Pair;

public class MoveMade extends Message {
  public MoveMade(Pair<Integer, Integer> tile) {
    this.tile = tile;
  }

  public Pair<Integer, Integer> getTile() {
    return tile;
  }

  public void setTile(Pair<Integer, Integer> tile) {
    this.tile = tile;
  }

  private Pair<Integer, Integer> tile = null;
}