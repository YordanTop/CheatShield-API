package org.cs.email_comunication.dto.response;


import java.time.LocalDate;


public record TrackEmailDTO(String emailTitle,
                            String receiverAddress,
                            LocalDate timeOfSending,
                            String reason,
                            boolean isEmailReceived) {

}
