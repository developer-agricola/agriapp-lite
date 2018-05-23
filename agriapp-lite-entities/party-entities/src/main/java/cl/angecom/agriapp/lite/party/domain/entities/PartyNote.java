package cl.angecom.agriapp.lite.party.domain.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class PartyNote {
	
	@EmbeddedId	
	private PartyNotePK partyNotePk;

	public PartyNotePK getPartyNotePk() {
		return partyNotePk;
	}

	public void setPartyNotePk(PartyNotePK partyNotePk) {
		this.partyNotePk = partyNotePk;
	}	 
	
}
