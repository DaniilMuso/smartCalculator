package platformcalculator;

import java.util.Scanner;

public class DivisionOperation extends DefaultMenuOperation {

    public DivisionOperation() {
        super(
                MessageBlock.builder()
                        .setHeader("ДЕЛЕНИЕ")
                        .addSection("Введите два числа, чтобы поделить.")
                        .build()
                        .toString()
        );
    }

    @Override
    protected String performInternal(Scanner inputScanner) {
        double a = readNextDouble(inputScanner), b = readNextDouble(inputScanner);
        double result = Main.getCalculator().divide(a, b);
        return "Частное равно: " + result;
    }

}
