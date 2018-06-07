package cl.agriapp.lite.queryside.party.infraestructure.producer.handler;

import cl.agriapp.lite.queryside.party.infraestructure.producer.event.PartyCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PartyEventHandler {

    @Autowired
    private PartyWebSocketHandler partyWebSocketHandler;

    public void handle(PartyCreatedEvent partyCreatedEvent){
        partyWebSocketHandler.sendEvent(partyCreatedEvent);
    }
}
