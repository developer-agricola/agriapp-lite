package cl.agriapp.lite.queryside.party.infraestructure.scheduler;

import cl.agriapp.lite.queryside.party.infraestructure.producer.event.PartyCreatedEvent;
import cl.agriapp.lite.queryside.party.infraestructure.producer.handler.PartyEventHandler;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Log4j2
@Component
public class PartyEventScheduler {

    @Autowired
    PartyEventHandler partyEventHandler;

    @Scheduled(fixedRate = 2000)
    public void emittPartyCreatedEvent(){
        PartyCreatedEvent partyCreatedEvent = new PartyCreatedEvent(
                Double.valueOf(Math.random()).toString(), "Daniel", "Carvajal");

        partyEventHandler.handle(partyCreatedEvent);

        log.info(String.format("Event emitted: %s ", partyCreatedEvent));

    }
}
