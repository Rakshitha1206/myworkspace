package com.training;

import javax.xml.ws.Endpoint;

public class Application {

	public static void main(String[] args) {

		WeatherServiceImplService service = new WeatherServiceImplService();
		WeatherService proxy = service.getPort(WeatherService.class);
		System.out.println(proxy.getWeather("SBC"));
	}

}
