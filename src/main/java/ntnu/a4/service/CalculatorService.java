package ntnu.a4.service;

import ntnu.a4.model.CalculatorModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

  Logger calculationLogger = LoggerFactory.getLogger(CalculatorService.class);

  public double calculateAndGetAnswer(CalculatorModel calculatorModel){
    calculationLogger.info("Calculation: " + calculatorModel.getEquation());
    double answer;
    switch (calculatorModel.getOperator()) {
      case '+' -> answer = calculatorModel.getFirstNumber() + calculatorModel.getSecondNumber();
      case '-' -> answer = calculatorModel.getFirstNumber() - calculatorModel.getSecondNumber();
      case '*' -> answer = calculatorModel.getFirstNumber() * calculatorModel.getSecondNumber();
      case '/' -> {
        if (calculatorModel.getSecondNumber() == 0) throw new ArithmeticException("Division by zero");
        answer = calculatorModel.getFirstNumber() / calculatorModel.getSecondNumber();
      }
      default -> throw new IllegalArgumentException("Invalid operator");
    }
    calculationLogger.info("Results: " + answer);
    return answer;
  }
}
