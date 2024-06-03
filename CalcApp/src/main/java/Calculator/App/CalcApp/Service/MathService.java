package Calculator.App.CalcApp.Service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

        public double subtract(double number1, double number2) {
            return number1 - number2;
        }

        public double multiply(double number1, double number2) {
            return number1 * number2;
        }

        public double divide(double number1, double number2) {
            if (number1 == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
            return number1 / number2;
        }


}
