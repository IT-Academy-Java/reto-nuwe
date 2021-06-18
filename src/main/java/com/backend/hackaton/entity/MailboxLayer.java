package com.backend.hackaton.entity;

public class MailboxLayer {
  private Boolean format_valid;

  public MailboxLayer() {
  }

  public MailboxLayer(Boolean format_valid) {
    this.format_valid = format_valid;
  }

  public Boolean getFormat_valid() {
    return format_valid;
  }

  public void setFormat_valid(Boolean format_valid) {
    this.format_valid = format_valid;
  }
}
