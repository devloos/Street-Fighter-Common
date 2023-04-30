package edu.st.common.messages.client;

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
public class JoinGame extends Message {
  private String username = null;
  private UUID gameId = null;
}
