package cl.angecom.agriapp.lite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.angecom.agriapp.lite.commons.configuration.AppConfiguration;

@SpringBootApplication
public class AgriAppCommons {

	public static void main(String args[]) {
		SpringApplication.run(AppConfiguration.class, args);
	}
}
