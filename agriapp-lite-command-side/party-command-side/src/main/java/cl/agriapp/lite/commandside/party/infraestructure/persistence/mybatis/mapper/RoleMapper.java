package cl.agriapp.lite.commandside.party.infraestructure.persistence.mybatis.mapper;

import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.RoleDto;
import org.apache.ibatis.annotations.Mapper;

import cl.agriapp.lite.commandside.party.infraestructure.producer.dto.RoleDto;

@Mapper
public interface RoleMapper {	
	
	void addPartyRole(RoleDto roleDto);
	
	
	
}
