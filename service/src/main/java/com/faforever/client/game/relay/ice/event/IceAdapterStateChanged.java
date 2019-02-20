package com.faforever.client.game.relay.ice.event;

public class IceAdapterStateChanged {
  private final String newState;

  public IceAdapterStateChanged(String newState) {
    this.newState = newState;
  }

  public String getNewState() {
    return newState;
  }
}
