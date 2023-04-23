package com.dep.common.messages.server;

import com.dep.common.messages.Message;
import com.dep.common.messages.MessageType;
import javafx.util.Pair;

public class MoveMade extends Message {
  public MoveMade(Pair<Integer, Integer> tile) {
    super(MessageType.MoveMade);
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