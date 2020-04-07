package com.neeraj.ws.app;

import javax.xml.ws.Endpoint;

import com.neeraj.ws.service.impl.CalcServiceImpl;

public class ServerApp {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/ws", new CalcServiceImpl());
		System.out.println("CalcServices Started!");
	}
}
