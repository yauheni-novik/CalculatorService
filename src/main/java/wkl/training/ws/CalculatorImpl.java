package wkl.training.ws;

import javax.jws.WebService;

import wkl.training.exception.InvalidDataException;

@WebService(endpointInterface = "wkl.training.ws.Calculator")
public class CalculatorImpl implements Calculator {

	public double calculate(int firstOperand, int secondOperand, String operator) throws Exception {
		if ("div".equals(operator)){
			if (secondOperand == 0){
				throw new InvalidDataException("Argument 'divisor' is 0");
			}
			return firstOperand / secondOperand;
		} else if ("mult".equals(operator)){
			return firstOperand * secondOperand;
		} else if ("minus".equals(operator)){
			return firstOperand - secondOperand;
		} else if ("plus".equals(operator)){
			return firstOperand + secondOperand;
		} else {
			throw new InvalidDataException("Operator is invalide");
		}
	}

}
