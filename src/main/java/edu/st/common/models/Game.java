package edu.st.common.models;

import java.net.Socket;
import java.util.ArrayList;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
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
