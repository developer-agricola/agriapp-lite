package cl.agriapp.lite.commandside.party.infraestructure.producer.handler;

import cl.agriapp.lite.commandside.party.infraestructure.producer.command.ProducerToSaveCommand;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PartyCommandHandler {	

	@Transactional
	public void handler(ProducerToSaveCommand command) {
		
	}

}
