package platformcalculator;

import java.util.Scanner;

public class NestedMenu implements MenuOperation {

    private final CliMenu cliMenu;

    public NestedMenu(CliMenu cliMenu) {
        this.cliMenu = cliMenu;
    }

    @Override
    public void perform(Scanner inputScanner) {
        cliMenu.run();
    }

}
