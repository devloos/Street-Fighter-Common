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
public class PlayerJoined extends Message {
  private String username = null;
}
