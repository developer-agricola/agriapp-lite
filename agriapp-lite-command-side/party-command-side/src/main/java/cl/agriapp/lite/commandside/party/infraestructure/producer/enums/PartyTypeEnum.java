package cl.agriapp.lite.commandside.party.infraestructure.producer.enums;

import java.util.HashMap;

public enum PartyTypeEnum {
	
	PERSON("PERSON", "Person"),
	GROUP("GROUP", "Group");
	

    private final String partyTypeId;
    private final String description; 

	private PartyTypeEnum(String partyTypeId, String description) {
		this.partyTypeId = partyTypeId;
		this.description = description;
	}

	
	
    private String getPartyTypeId() {
		return partyTypeId;
	}



	private String getDescription() {
		return description;
	}


	public static HashMap<String, String> getHashMapValues() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (PartyTypeEnum e : PartyTypeEnum.values()) {
            hashMap.put(e.getPartyTypeId(), e.getDescription());
        }
        return hashMap;
    }

}
