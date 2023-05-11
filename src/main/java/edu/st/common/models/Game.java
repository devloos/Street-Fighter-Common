package edu.st.common.models;

import java.net.Socket;
import java.util.ArrayList;
import java.util.UUID;

public class Game {
  public Game(UUID gameId, String hostname, Socket hostSocket, String playername, Socket playerSocket) {
    this.gameId = gameId;
    this.hostname = hostname;
    this.hostSocket = hostSocket;
    this.playername = playername;
    this.playerSocket = playerSocket;

    board = new ArrayList<ArrayList<Token>>();
    for (int i = 0; i < 3; ++i) {
      board.add(new ArrayList<Token>());
      for (int j = 0; j < 3; ++j) {
        board.get(i).add(null);
      }
    }
  }

  public Game() {
    this.gameId = null;
    this.hostname = null;
    this.hostSocket = null;
    this.playername = null;
    this.playerSocket = null;
    this.currentPlayer = Token.X;
    this.live = false;
    this.hostPlayAgain = false;
    this.playerPlayAgain = false;
    this.board = null;
  }

  public void updateBoard(Integer row, Integer col) {
    switch (currentPlayer) {
      case X: {
        board.get(row).set(col, currentPlayer);
        setCurrentPlayer(Token.Y);
        break;
      }
      case Y: {
        board.get(row).set(col, currentPlayer);
        setCurrentPlayer(Token.X);
        break;
      }
      default: {
        break;
      }
    }
  }

  public void resetGame() {
    // clear state
    for (ArrayList<Token> row : board) {
      for (int i = 0; i < row.size(); ++i) {
        row.set(i, null);
      }
    }

    // Player one starts again
    setCurrentPlayer(Token.X);
  }

  public boolean playAgain() {
    return hostPlayAgain && playerPlayAgain;
  }

  // ! Getters and Setters

  public UUID getGameId() {
    return gameId;
  }

  public void setGameId(UUID gameId) {
    this.gameId = gameId;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public Socket getHostSocket() {
    return hostSocket;
  }

  public void setHostSocket(Socket hostSocket) {
    this.hostSocket = hostSocket;
  }

  public String getPlayername() {
    return playername;
  }

  public void setPlayername(String playername) {
    this.playername = playername;
  }

  public Socket getPlayerSocket() {
    return playerSocket;
  }

  public void setPlayerSocket(Socket playerSocket) {
    this.playerSocket = playerSocket;
  }

  public Token getCurrentPlayer() {
    return currentPlayer;
  }

  public void setCurrentPlayer(Token currentPlayer) {
    this.currentPlayer = currentPlayer;
  }

  public boolean isLive() {
    return live;
  }

  public void setLive(boolean live) {
    this.live = live;
  }

  public boolean isHostPlayAgain() {
    return hostPlayAgain;
  }

  public void setHostPlayAgain(boolean hostPlayAgain) {
    this.hostPlayAgain = hostPlayAgain;
  }

  public boolean isPlayerPlayAgain() {
    return playerPlayAgain;
  }

  public void setPlayerPlayAgain(boolean playerPlayAgain) {
    this.playerPlayAgain = playerPlayAgain;
  }

  public ArrayList<ArrayList<Token>> getBoard() {
    return board;
  }

  public void setBoard(ArrayList<ArrayList<Token>> board) {
    this.board = board;
  }

  private UUID gameId = null;
  private String hostname = null;
  private Socket hostSocket = null;
  private String playername = null;
  private Socket playerSocket = null;
  private Token currentPlayer = Token.X;
  private boolean live = false;
  private boolean hostPlayAgain = false;
  private boolean playerPlayAgain = false;
  private ArrayList<ArrayList<Token>> board = null;
}
