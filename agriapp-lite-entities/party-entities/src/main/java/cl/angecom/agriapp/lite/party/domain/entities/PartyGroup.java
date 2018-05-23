package cl.angecom.agriapp.lite.party.domain.entities;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PARTY_GROUP")
public class PartyGroup {

	@Id	
	@Column(name = "PARTY_ID", nullable = false, length = 20)
	private String partyId;
	
	@Column(name = "GROUP_NAME", nullable = false, length = 100)
	private String groupName;
	
	@Column(name = "GROUP_NAME_LOCAL", length = 100)
	private String groupNameLocal;
	
	@Column(name = "OFFICE_SITE_NAME", length = 100)
	private String officeSiteName;
	
	@Column(name = "ANNUAL_REVENUE",  precision = 18, scale = 2)
	private BigDecimal annualRevenue;
	
	@Column(name = "NUM_EMPLOYEES" )
	private Long numEmployees;
	
	@Column(name = "COMMENTS", length = 255)
	private String comments;
		
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "LOGO_IMAGE")
	private String logoImage;
	
}
