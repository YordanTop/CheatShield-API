package org.cs.email_comunication.dto.request;

public record RequestEmailBodyDTO(String title,
                                  String context,
                                  String receiverAddress)
{ }
