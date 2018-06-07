package cl.agriapp.lite.commandside.party.infraestructure.producer.dto;

import lombok.Data;
import cl.agriapp.lite.commandside.party.infraestructure.producer.enums.PartyTypeEnum;

import java.sql.Date;

@Data
public class PartyDto {
	Long partyId;	
	String socialIdentifier;
	String firstName;
	String lastName;
	String groupName;	
	PartyTypeEnum partyType;
	String description;
	String statusId;
	String comments;
	
	Date createdDate;
	String createByUserLogin;
	Date lastModifiedDate;
	String lastModifiedByUserLogin;
}
