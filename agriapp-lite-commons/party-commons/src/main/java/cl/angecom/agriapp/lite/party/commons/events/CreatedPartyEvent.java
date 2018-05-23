package cl.angecom.agriapp.lite.party.commons.events;

import java.util.Date;

import org.springframework.stereotype.Component;

import cl.angecom.agriapp.lite.party.commons.commands.CreatePartyCommand;

@Component
public class CreatedPartyEvent {	
	private String partyId;	
	private String rolUnicoNacional;		
	private String rolUnicoTributario;	
	private String description;
	private String statusId;
	private Date createdDate;
	private String createdByUserLogin;
	private Date lastModifiedDate;
	private String lastModifiedByUserLogin;
	private String partyTypeId;
	
	public CreatedPartyEvent(){}
	
	public CreatedPartyEvent(CreatePartyCommand command){
		setPartyId(command.getPartyId());
		setRolUnicoNacional(command.getRolUnicoNacional());
		setRolUnicoTributario(command.getRolUnicoTributario());
		setDescription(command.getDescription());
		setStatusId(command.getStatusId());
		setCreatedDate(new Date());		
		setCreatedByUserLogin(command.getCreatedByUserLogin());
		setLastModifiedDate(new Date());
		setLastModifiedByUserLogin(command.getCreatedByUserLogin());
		setPartyTypeId(command.getPartyId());
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
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}
	public void setCreatedByUserLogin(String createdByUserLogin) {
		this.createdByUserLogin = createdByUserLogin;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}
	public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
		this.lastModifiedByUserLogin = lastModifiedByUserLogin;
	}
	public String getPartyTypeId() {
		return partyTypeId;
	}
	public void setPartyTypeId(String partyTypeId) {
		this.partyTypeId = partyTypeId;
	}	
}
