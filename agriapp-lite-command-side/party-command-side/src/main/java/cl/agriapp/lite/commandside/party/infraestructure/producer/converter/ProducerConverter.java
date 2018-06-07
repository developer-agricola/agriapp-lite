package cl.agriapp.lite.commandside.party.infraestructure.producer.converter;

import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Location;
import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.NationalSingleRole;
import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Producer;
import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.SocialIdentifier;
import cl.agriapp.lite.commandside.party.infraestructure.producer.command.ProducerToSaveCommand;

public class ProducerConverter implements Converter<ProducerToSaveCommand, Producer> {

	@Override
	public Producer convert(ProducerToSaveCommand command) {
		SocialIdentifier socialIdentifier = new NationalSingleRole(command.getNationalSingleRole());
		
		//Location city = new Location(locationId, locationType, locationCode, abbreviation);
		
		
		
		return null;
	}
	
	
	
	
}
