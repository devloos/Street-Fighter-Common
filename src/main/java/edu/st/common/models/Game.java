package edu.st.common.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Game {
  private UUID gameId = null;
  private String gamename = null;
  private String hostname = null;
  private String playername = null;
}
