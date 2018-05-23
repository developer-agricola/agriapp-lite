package cl.angecom.agriapp.lite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgriAppLite {

	public static void main(String args[]) {
		SpringApplication.run(AxonConfiguration.class, args);
	}
}
