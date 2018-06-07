package cl.agriapp.lite.commandside.party.domain.agregates.models.producer;

public abstract class SocialIdentifier {
		
	protected abstract void assertIfValidIdentifier(String id);
	
	public abstract String getIdentifier();	
}
