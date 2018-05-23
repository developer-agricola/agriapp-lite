package cl.angecom.agriapp.lite.commons.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"cl.angecom.agriapp.lite"})
@EnableAutoConfiguration
public class AppConfiguration {
	
}
