package org.ruanwei.demo;

import org.ruanwei.demo.user.web.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author ruanwei
 *
 */
@Configuration
public class WebAppConfig implements WebFluxConfigurer {

	@Autowired
	private UserHandler userHandler;

	@Bean
	public RouterFunction<ServerResponse> timerRouter() {
		return RouterFunctions
				.route(RequestPredicates.GET("/time"), userHandler::getTime)
				.andRoute(RequestPredicates.GET("/date"), userHandler::getDate)
				.andRoute(RequestPredicates.GET("/times"),
						userHandler::sendTimePerSec);
	}
}
