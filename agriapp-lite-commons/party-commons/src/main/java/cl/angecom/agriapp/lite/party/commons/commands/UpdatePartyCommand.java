package cl.angecom.agriapp.lite.party.commons.commands;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;
import org.springframework.stereotype.Component;

import cl.angecom.agriapp.lite.party.commons.dto.PersonDTO;

@Component
public class UpdatePartyCommand {
	@TargetAggregateIdentifier
	private String partyId;
	//PARTY FIELD
	private String rolUnicoNacional;
	private String rolUnicoTributario;
	private String description;
	private String statusId;
	private String createdByUserLogin;
	private String partyTypeId;
	
	//PERSON FIELD
	private PersonDTO personDto;
	
	public UpdatePartyCommand() {		
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getRolUnicoNacional() {
		return rolUnicoNacional;
	}

	public void setRolUnicoNacional(String rolUnicoNacional) {
		this.rolUnicoNacional = rolUnicoNacional;
	}

	public String getRolUnicoTributario() {
		return rolUnicoTributario;
	}

	public void setRolUnicoTributario(String rolUnicoTributario) {
		this.rolUnicoTributario = rolUnicoTributario;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	public String getStatusId() {
		return statusId;
	}

	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}

	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	public void setCreatedByUserLogin(String createdByUserLogin) {
		this.createdByUserLogin = createdByUserLogin;
	}

	public String getPartyTypeId() {
		return partyTypeId;
	}

	public void setPartyTypeId(String partyTypeId) {
		this.partyTypeId = partyTypeId;
	}

	public PersonDTO getPersonDto() {
		return personDto;
	}

	public void setPersonDto(PersonDTO personDto) {
		this.personDto = personDto;
	}	
}
