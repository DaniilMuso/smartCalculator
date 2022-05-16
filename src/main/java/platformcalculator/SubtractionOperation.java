package platformcalculator;

import java.util.Scanner;

public class SubtractionOperation extends platformcalculator.DefaultMenuOperation {

    public SubtractionOperation() {
        super(
                MessageBlock.builder()
                        .setHeader("ВЫЧИТАНИЕ")
                        .addSection("Введите два числа, чтобы вычесть.")
                        .build()
                        .toString()
        );
    }

    @Override
    protected String performInternal(Scanner inputScanner) {
        double a = readNextDouble(inputScanner), b = readNextDouble(inputScanner);
        double result = platformcalculator.Main.getCalculator().subtract(a, b);
        return "Разница равна: " + result;
    }

}
