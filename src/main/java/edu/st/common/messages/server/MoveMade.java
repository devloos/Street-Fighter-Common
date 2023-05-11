package edu.st.common.messages.server;

import edu.st.common.messages.Message;

public class MoveMade extends Message {
  private Integer row = null;
  private Integer col = null;

  public MoveMade() {
  }

  public MoveMade(Integer row, Integer col) {
    this.row = row;
    this.col = col;
  }

  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public Integer getCol() {
    return col;
  }

  public void setCol(Integer col) {
    this.col = col;
  }
}
