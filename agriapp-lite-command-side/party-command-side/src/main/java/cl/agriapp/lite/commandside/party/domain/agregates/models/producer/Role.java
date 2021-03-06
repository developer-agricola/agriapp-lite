package cl.agriapp.lite.commandside.party.domain.agregates.models.producer;

import lombok.Value;

@Value
public class Role {
	
    private final Identifier roleId;
    private final Type roleType;
    private final String roleDescription;
    
    public Role(Identifier roleId, Type roleType, String roleDescription) {
    	this.roleId = roleId;
    	this.roleType = roleType;
    	this.roleDescription = roleDescription;
    }  
    
    
    @Override
    protected Object clone() throws CloneNotSupportedException {    	
    	return new Role(roleId, roleType, roleDescription);
    }
}
    
