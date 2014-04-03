package wkl.training.publisher;

import javax.xml.ws.Endpoint;

import wkl.training.ws.CalculatorImpl;

public class CalculatorPublisher {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/calculator", new CalculatorImpl());
	    }
}
