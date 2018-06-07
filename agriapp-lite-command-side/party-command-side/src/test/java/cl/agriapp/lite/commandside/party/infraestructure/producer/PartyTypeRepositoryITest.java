package cl.agriapp.lite.commandside.party.infraestructure.producer;

import cl.agriapp.lite.commandside.party.infraestructure.producer.repository.ProducerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.agriapp.lite.commandside.party.domain.agregates.models.producer.Identifier;


import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PartyTypeRepositoryITest {

	@Autowired
	ProducerRepository repository;

	@Test
	public void nextIdentity() {
		Identifier identifier = repository.nextIdentity();
		//
		assertNotNull(identifier.getId().equals(1L));
		
		identifier = repository.nextIdentity();
		//

		assertNotNull(identifier.getId().equals(2L));
		
	}
}
