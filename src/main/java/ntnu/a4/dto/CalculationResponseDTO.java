package ntnu.a4.dto;

public class CalculationResponseDTO {
  private double answer;

  public CalculationResponseDTO(double answer) {
    this.answer = answer;
  }

  public double getAnswer() {
    return answer;
  }

  public void setAnswer(double answer) {
    this.answer = answer;
  }
}
