package cl.agriapp.lite.commandside.party.infraestructure.producer.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProducerToSaveCommand {	
	public String nationalSingleRole;
	public String firstName;
	public String lastName;
	public String cityId;
	public String comuneId;
	public String regionId;
	public String country;
	public String siteOfProduction;
	public String globalGapNumber;
	
}
