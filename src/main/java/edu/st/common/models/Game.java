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
  }

  private UUID gameId = null;
  private String hostname = null;
  private Socket hostSocket = null;
  private String playername = null;
  private Socket playerSocket = null;
  private ArrayList<ArrayList<String>> board = new ArrayList<>();
}
