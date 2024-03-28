package ntnu.a4.controller;

import ntnu.a4.dto.CalculationResponseDTO;
import ntnu.a4.model.CalculatorModel;
import ntnu.a4.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class CalculatorController {

  @Autowired
  private CalculatorService calculatorService;

  @PostMapping("/calculate")
  @ResponseBody
  public CalculationResponseDTO calculate(@RequestBody CalculatorModel calculatorModel){
    double answer = calculatorService.calculateAndGetAnswer(calculatorModel);
    return new CalculationResponseDTO(answer);
  }
}
