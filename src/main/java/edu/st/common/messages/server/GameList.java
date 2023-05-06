package edu.st.common.messages.server;

import java.util.ArrayList;
import java.util.UUID;

import edu.st.common.messages.Message;
import edu.st.common.models.GamePair;
import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameList extends Message {
  private ArrayList<GamePair> games = null;
}
