package cl.agriapp.lite.commandside.party.infraestructure.producer.repository;

import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Identifier;
import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Producer;
import cl.agriapp.lite.commandside.party.infraestructure.producer.converter.IdentifierConverter;
import cl.agriapp.lite.commandside.party.infraestructure.producer.converter.PartyConverter;
import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.PartyDto;
import cl.agriapp.lite.commandside.party.infraestructure.producer.enums.PartyTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProducerRepository {	
		
	@Autowired
	PartyMyBatisRepository partyRepository;
	@Autowired
	RoleMyBatisRepository roleRepository;
		
	@Autowired
    PartyConverter partyConverter;
	@Autowired
    IdentifierConverter IdentifierConverter;
	
	
	public Identifier nextIdentity() {
		return IdentifierConverter.convert(partyRepository.nextdentity());		
	}
	
	public boolean add(Producer producer) {
		boolean isAdd = false;	
		
		PartyDto partyDto = partyConverter.convert(producer);
		partyDto.setPartyType(PartyTypeEnum.PERSON);
		
		
		return isAdd;
	}	
}
