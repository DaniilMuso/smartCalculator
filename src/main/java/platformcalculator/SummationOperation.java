package platformcalculator;

import java.util.Scanner;

public class SummationOperation extends DefaultMenuOperation {

    public SummationOperation() {
        super(
                MessageBlock.builder()
                        .setHeader("СЛОЖЕНИЕ")
                        .addSection("Введите два числа, чтобы сложить.")
                        .build()
                        .toString()
        );
    }

    @Override
    protected String performInternal(Scanner inputScanner) {
        double a = readNextDouble(inputScanner), b = readNextDouble(inputScanner);
        double result = Main.getCalculator().summ(a, b);
        return "Сумма равна: " + result;
    }

}
