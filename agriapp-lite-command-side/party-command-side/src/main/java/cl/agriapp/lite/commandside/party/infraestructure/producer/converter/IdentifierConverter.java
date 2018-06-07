package cl.agriapp.lite.commandside.party.infraestructure.producer.converter;

import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Identifier;
import org.springframework.stereotype.Component;

@Component
public class IdentifierConverter implements Converter<Long, Identifier>{

	public Identifier convert(Long id) {
		return new Identifier(String.valueOf(id));
	}	

}
