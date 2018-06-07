package cl.agriapp.lite.commandside.party.infraestructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PartyCommandSideApp {

	public static void main(String args[]) {
		SpringApplication.run(PartyCommandSideConfig.class, args);		
	}
}
