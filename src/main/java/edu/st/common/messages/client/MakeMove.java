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
public class MakeMove extends Message {
  private Integer row = null;
  private Integer col = null;
}
