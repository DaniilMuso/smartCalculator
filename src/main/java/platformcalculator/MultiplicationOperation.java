package platformcalculator;

import java.util.Scanner;

public class MultiplicationOperation extends DefaultMenuOperation {

    public MultiplicationOperation() {
        super(
                MessageBlock.builder()
                        .setHeader("УМНОЖЕНИЕ")
                        .addSection("Введите два числа, чтобы умножить.")
                        .build()
                        .toString()
        );
    }

    @Override
    protected String performInternal(Scanner inputScanner) {
        double a = readNextDouble(inputScanner), b = readNextDouble(inputScanner);
        double result = Main.getCalculator().multiply(a, b);
        return "Ответ равен: " + result;
    }

}
