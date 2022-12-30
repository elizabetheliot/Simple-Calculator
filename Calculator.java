// This program is a simple calculator that takes two doubles as arguments and either adds, subtracts, multiplies, divides, or finds the remainder. 
public class Calculator {
  public Calculator() {
    }
  public double add(double a, double b){
    double sum = a + b;
    return sum;
  }
  public double subtract(double a, double b) {
    double difference = a - b;
    return difference;
}
  public double multiply(double a, double b) {
    double result = a * b;
    return result;
  }
  public double divide(double a, double b) {
    double answer = a / b;
    return answer;
}
  public double modulo(double a, double b) {
    double ans = a % b;
    return ans;
}
  public static void main(String args[]) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5.4,7.9));
    System.out.println(myCalculator.subtract(45.12,11));
    System.out.println(myCalculator.multiply(12.6,7));
    System.out.println(myCalculator.divide(45,3));
    System.out.println(myCalculator.modulo(67,3));

}

}
