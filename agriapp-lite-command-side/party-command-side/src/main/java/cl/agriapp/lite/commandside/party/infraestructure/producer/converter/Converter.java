package cl.agriapp.lite.commandside.party.infraestructure.producer.converter;

public interface Converter<From, To> {
	
	To convert(From from);
	
}
