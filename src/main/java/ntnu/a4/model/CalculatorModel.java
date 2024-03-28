package ntnu.a4.model;

public class CalculatorModel {

  private char operator;
  private double firstNumber;
  private double secondNumber;
  private double answer;

  public CalculatorModel(){}

  public char getOperator() {
    return operator;
  }

  public void setOperator(char operator) {
    this.operator = operator;
  }


  public double getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  public double getAnswer() {
    return answer;
  }

  public void setAnswer(double answer) {
    this.answer = answer;
  }

  public String getEquation(){
    return firstNumber + " " + operator + " " + secondNumber;
  }
}