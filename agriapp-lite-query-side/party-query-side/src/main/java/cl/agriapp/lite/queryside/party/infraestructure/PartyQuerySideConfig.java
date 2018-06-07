package cl.agriapp.lite.queryside.party.infraestructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;


import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan({"cl.agriapp.lite.queryside.party"})
@EnableAutoConfiguration
@EnableScheduling
public class PartyQuerySideConfig {

    @Autowired
    private WebSocketHandler webSocketHandler;


    @Bean
    public HandlerMapping handlerMapping(){
        Map<String, WebSocketHandler> webSocketHandlerMap = new HashMap<>();
        webSocketHandlerMap.put("/xxx", webSocketHandler);

        SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping();
        handlerMapping.setOrder(10);
        handlerMapping.setUrlMap(webSocketHandlerMap);

        return handlerMapping;
    }


    @Bean
    public WebSocketHandlerAdapter handlerAdapter() {
        return new WebSocketHandlerAdapter();
    }

}
