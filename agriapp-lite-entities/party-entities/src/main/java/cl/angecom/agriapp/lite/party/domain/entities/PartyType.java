package cl.angecom.agriapp.lite.party.domain.entities;        

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PARTY_TYPE")
public class PartyType {
	
	@Id	
	@Column(name = "PARTY_TYPE_ID", nullable = false, length = 20)
	private String partyTypeId;
	
	@Column(name = "PARENT_TYPE_ID", length = 20)
	private String parentTypeId;
	
	@Column(name = "DESCRIPTION", length = 255)
	private String description;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PARTY_TYPE_ID", nullable = false )
	private Set<PartyType> partyTypes;
	
}
