package cl.agriapp.lite.queryside.party.domain.agregates.models.producer;

public abstract class SocialIdentifier {
		
	protected abstract void assertIfValidIdentifier(String id);
	
	public abstract String getIdentifier();	
}
