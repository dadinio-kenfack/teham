package com.orchestre.tehamnewversion.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebsocketsBrokerConfig implements WebSocketMessageBrokerConfigurer{

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		
		//Use this for enabled a full config
		/* config.enableStompBrokerRelay("/topic")
		.setRelayHost("localhost")
		.setRelayPort(8065)
		.setClientLogin("myLog")
		.setClientPasscode("guest");  */
		
		config.enableSimpleBroker("/topic", "/Teham");
		config.setApplicationDestinationPrefixes("/app");
	}
	
	@Override public void registerStompEndpoints(StompEndpointRegistry registry) {
		
		registry.addEndpoint("/ws").setAllowedOrigins("http://localhost:4200").withSockJS();
	}
	

}
