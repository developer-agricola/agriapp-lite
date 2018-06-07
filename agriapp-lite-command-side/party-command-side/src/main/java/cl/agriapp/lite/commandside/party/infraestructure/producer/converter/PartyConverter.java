package cl.agriapp.lite.commandside.party.infraestructure.producer.converter;

import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Producer;
import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.PartyDto;
import org.springframework.stereotype.Component;


@Component
public class PartyConverter implements Converter<Producer, PartyDto>{

	public PartyDto convert(Producer producer) {
		PartyDto partyDto = new PartyDto();
		partyDto.setPartyId(Long.valueOf(producer.getProducerId().getId()));
		partyDto.setSocialIdentifier(producer.getSocialIdentifier().getIdentifier());
		partyDto.setFirstName(producer.getFirstName());
		partyDto.setLastName(producer.getLastName());	
		
		return partyDto;
	}

	

}
