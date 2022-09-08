package com.timesink.model;

import java.util.UUID;

public class Film {
  private final UUID id;
  private final String title;

  public Film(UUID id, String title) {
    this.id = id;
    this.title = title;
  }

  public UUID getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

}
