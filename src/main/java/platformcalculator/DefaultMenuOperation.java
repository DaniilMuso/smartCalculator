package platformcalculator;

import java.util.Scanner;

public abstract class DefaultMenuOperation implements MenuOperation {

    private final String welcomeMessage;

    protected DefaultMenuOperation(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public final void perform(Scanner inputScanner) {
        System.out.println(welcomeMessage);
        try {
            var result = performInternal(inputScanner);
            System.out.println(result);
        } catch (CalculationException e) {
            System.out.println(e.getMessage());
        }
    }

    protected abstract String performInternal(Scanner inputScanner);

    protected double readNextDouble(Scanner inputScanner) {
        while (!inputScanner.hasNextDouble()) {
            inputScanner.next();
        }
        return inputScanner.nextDouble();
    }

}
