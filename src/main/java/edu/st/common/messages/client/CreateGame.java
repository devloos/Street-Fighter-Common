package edu.st.common.messages.client;

import edu.st.common.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateGame extends Message {
  private String username = null;
  private String gamename = null;
}
