package cl.angecom.agriapp.lite;

import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.SimpleCommandBus;
import org.axonframework.commandhandling.annotation.AnnotationCommandHandlerBeanPostProcessor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.commandhandling.gateway.DefaultCommandGateway;
import org.axonframework.contextsupport.spring.AnnotationDriven;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@AnnotationDriven
@EnableAutoConfiguration
public class AxonConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public CommandBus commandBus() {
		SimpleCommandBus simpleCommandBus = new SimpleCommandBus();
		return simpleCommandBus;
	}

	@Bean
	@ConditionalOnMissingBean
	public CommandGateway commandGateway() {
		return new DefaultCommandGateway(commandBus());
	}

	/**
	 * The AnnotationCommandHandlerBeanPostProcessor finds all beans that has @CommandHandler
	 * and subscribed them to the commandBus with the first argument of the
	 * method being the the command type the method will be subscribed to.
	 */
	@Bean
	@ConditionalOnMissingBean
	public AnnotationCommandHandlerBeanPostProcessor annotationCommandHandlerBeanPostProcessor() {
		AnnotationCommandHandlerBeanPostProcessor processor = new AnnotationCommandHandlerBeanPostProcessor();
		processor.setCommandBus(commandBus());
		return processor;
	}
}
