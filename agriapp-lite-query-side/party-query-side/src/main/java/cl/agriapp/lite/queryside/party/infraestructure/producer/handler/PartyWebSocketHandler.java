package cl.agriapp.lite.queryside.party.infraestructure.producer.handler;

import cl.agriapp.lite.queryside.party.infraestructure.producer.event.PartyCreatedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class PartyWebSocketHandler implements WebSocketHandler {

	Flux<PartyCreatedEvent> partyCreatedEventFlux = Flux.empty();






	public void sendEvent(PartyCreatedEvent partyCreatedEvent){
		partyCreatedEventFlux.just(partyCreatedEvent);
	}

	public Mono<Void> handle(WebSocketSession webSocketSession) {
		Mono<Void> mono = Mono.never();
		if(Flux.empty().equals(partyCreatedEventFlux)){
			 return  mono;
		}else {

			return webSocketSession.send(
					partyCreatedEventFlux
							.map(message -> message.getFirstName())
							.map(webSocketSession::textMessage)
							.log()
			);
		}
	}
}
