package cl.agriapp.lite.commandside.party.infraestructure.cuestionario.di;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest


@Service
@Repository
@Component
@Configuration

public class InjectionDepencyITest {

	@Autowired
	@Qualifier(value = "serviceImplMock")

	IService service;

	@Test
	public void testSomeMethod() {
		Assert.assertTrue(service instanceof ServiceImplMock);
	}
}
