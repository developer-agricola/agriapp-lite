package cl.angecom.agriapp.lite.party.domain.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PartyNotePK {
	
	@Column(name = "PARTY_ID", nullable = false, length = 20)
	private String partyId;

	@Column(name = "NOTE_ID", nullable = false, length = 20)
	private String noteId;
}
