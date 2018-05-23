package cl.angecom.agriapp.lite.party.domain.entities;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PARTY")
public class Party {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PARTY_ID", nullable = false, length = 20)
	private String partyId;

	@Column(name = "RUN", nullable = false, length = 20)
	private String rolUnicoNacional;
	
	@Column(name = "RUT", length = 20)
	private String rolUnicoTributario;	
	
	@Column(name = "EXTERNAL_ID", length = 20)
	private String externalId;

	@Column(name = "DESCRIPTION", length = 255)
	private String description;

	@Column(name = "STATUS_ID", nullable = false, length = 20)
	private String statusId;

	@Column(name = "CREATED_DATE", nullable = false)
	private Date createdDate;

	@Column(name = "CREATED_BY_USER_LOGIN", nullable = false, length = 255)
	private String createdByUserLogin;

	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	@Column(name = "LAST_MODIFIED_BY_USER_LOGIN", length = 255)
	private String lastModifiedByUserLogin;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", nullable = false )
	private Set<PartyType> partyTypes;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", nullable = false )
	private List<PartyNote> partyNotes;
	
	@OneToOne(fetch = FetchType.EAGER)
	private Person person;	
	
	@OneToOne(fetch = FetchType.EAGER)
	private PartyGroup partyGroup; 
			
}
