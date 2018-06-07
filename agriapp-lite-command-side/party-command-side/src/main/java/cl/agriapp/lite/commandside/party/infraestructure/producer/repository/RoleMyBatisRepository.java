package cl.agriapp.lite.commandside.party.infraestructure.producer.repository;

import cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.mapper.RoleMapper;
import cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.repository.MyBatisRepository;
import cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.repository.MyBatisSpecification;
import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.RoleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleMyBatisRepository implements MyBatisRepository<RoleDto> {

	@Autowired
	RoleMapper mapper;

	@Override
	public void add(RoleDto roleDto) {
		mapper.addPartyRole(roleDto);		
	}

	@Override
	public void add(Iterable<RoleDto> roleDtos) {
		for(RoleDto roleDto : roleDtos) {
			mapper.addPartyRole(roleDto);
		}
		
	}

	@Override
	public void update(RoleDto roleDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(RoleDto roleDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MyBatisSpecification specification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleDto> query(MyBatisSpecification specification) {
		// TODO Auto-generated method stub
		return null;
	}		
	
}
