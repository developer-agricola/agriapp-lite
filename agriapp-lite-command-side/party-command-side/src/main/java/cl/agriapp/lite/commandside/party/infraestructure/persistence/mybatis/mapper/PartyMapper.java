package cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.mapper;

import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.PartyDto;
import org.apache.ibatis.annotations.Mapper;

import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.PartyDto;

@Mapper
public interface PartyMapper {

	Long nexValueForIdentifier();	
	
	void saveParty(PartyDto partyDto);
	
	void savePerson(PartyDto partyDto);
	
	void saveGroup(PartyDto partyDto);
	
}
