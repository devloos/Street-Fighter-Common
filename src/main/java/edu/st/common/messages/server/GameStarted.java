package edu.st.common.messages.server;

import java.util.UUID;

import edu.st.common.messages.Message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameStarted extends Message {
  private String username = null;
  private UUID gameId = null;
  private boolean isHost = false;
}
