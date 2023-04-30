package edu.st.common.messages.server;

import edu.st.common.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameJoined extends Message {
  private String hostUsername = null;
}
