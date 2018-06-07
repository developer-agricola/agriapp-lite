package cl.agriapp.lite.queryside.party.domain.agregates.models.producer;

import lombok.Value;

@Value
public class Type {
	
    private final Identifier typeId;  
            
    public Type(Identifier typeId){
    	this.typeId = typeId;   	
    }	
    
    
    @Override
    protected Object clone() throws CloneNotSupportedException {    	
    	return new Type(typeId);
    }
}
    
               
