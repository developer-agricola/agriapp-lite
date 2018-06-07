package cl.agriapp.lite.commandside.party.infraestructure.producer.repository;

import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.PartyDto;
import cl.agriapp.lite.commandside.party.infraestructure.producer.enums.PartyTypeEnum;
import cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.mapper.PartyMapper;
import cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.repository.MyBatisRepository;
import cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.repository.MyBatisSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartyMyBatisRepository implements MyBatisRepository<PartyDto> {

	@Autowired
	PartyMapper mapper;
	
	public Long nextdentity() {
		return mapper.nexValueForIdentifier();		
	}


	@Override
	public void add(PartyDto partyDto) {	
		if(PartyTypeEnum.PERSON.equals(partyDto.getPartyType())) {
			mapper.saveParty(partyDto);
			mapper.savePerson(partyDto);
			
		}else if(PartyTypeEnum.GROUP.equals(partyDto.getPartyType())) {
			mapper.saveParty(partyDto);
			mapper.saveGroup(partyDto);
		}else {
			throw new IllegalArgumentException("The party must be Person or Group.");
		}
	}


	@Override
	public void add(Iterable<PartyDto> partyDtos) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(PartyDto partyDto) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(PartyDto partyDto) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(MyBatisSpecification specification) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<PartyDto> query(MyBatisSpecification specification) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
