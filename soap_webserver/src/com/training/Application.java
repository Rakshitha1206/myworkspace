package com.training;

import javax.xml.ws.Endpoint;

import com.training.sevices.WeatherServiceImpl;

public class Application {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:5050/weather",new WeatherServiceImpl() );
        System.out.println("service published");
	}

}
