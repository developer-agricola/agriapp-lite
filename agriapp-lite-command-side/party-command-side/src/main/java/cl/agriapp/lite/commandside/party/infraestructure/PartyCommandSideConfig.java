package cl.agriapp.lite.commandside.party.infraestructure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"cl.agriapp.lite.party"})
@EnableAutoConfiguration
public class PartyCommandSideConfig {

}
