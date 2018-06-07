package cl.agriapp.lite.queryside.party.domain.agregates.models.producer;

import java.util.List;

import lombok.Data;


@Data
public class Producer {

	private final Identifier producerId;
	private final List<Role> roles;
	private final SocialIdentifier socialIdentifier; // rut o run
	private final String firstName;
	private final String lastName;
	private final Geo geo;
	private final Code siteOfProduction; // sdp
	private final Code globalGapNumber; // gpp

	private Producer(Identifier producerId, List<Role> roles, SocialIdentifier socialIdentifier, 
			String firstName, String lastName, Geo geo, Code siteOfProduction, Code globalGapNumber) {		
		this.producerId = producerId;		
		this.roles = roles;			
		this.socialIdentifier = socialIdentifier;
		this.firstName = firstName;
		this.lastName = lastName;
		this.geo = geo;
		this.siteOfProduction = siteOfProduction;
		this.globalGapNumber = globalGapNumber;		
	}

	public Producer create(Identifier producerId, List<Role> roles, SocialIdentifier socialIdentifier,
			String firstName, String lastName, Geo geo, Code siteOfProduction, Code globalGapNumber) {    	 
    	 return new Producer(producerId, roles, socialIdentifier, firstName, lastName, geo, siteOfProduction, globalGapNumber);
    }
	
	public Role makeRole(Identifier id, String roleType, String roleDescription)  {		
		Type producerRoleType = new Type(new Identifier(roleType));
		Role producerRole = new Role(id, producerRoleType, roleDescription);
						
		return producerRole;
	}
	
	public Geo makeGeographicUbication(Identifier geoId, 
			Location city, Location comune, Location province, Location region, Location country, Double latitude,Double longitude) {
		return new Geo(geoId, city, comune, province, region, country, latitude, longitude);
	}	
	
}
