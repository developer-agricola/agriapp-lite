package cl.agriapp.lite.queryside.party.infraestructure.producer.event;

import lombok.Value;

@Value
public class PartyCreatedEvent {

    private String id;

    private String firstName;

    private String lastName;
}
