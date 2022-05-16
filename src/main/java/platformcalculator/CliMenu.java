package platformcalculator;

import java.util.Map;
import java.util.Scanner;

public class CliMenu {

	public static boolean exitRequested = false;
	public static final String EXIT_INPUT = "exit";
	public static final String BACK_INPUT = "back";
	public static final String HELP_INPUT = "help";
	private final Scanner inputScanner;
	private final String welcomeMessage;
	private final String leaveMessage;
	private final Map<Integer, MenuOperation> operations;

	public CliMenu(
			Scanner inputScanner,
			String welcomeMessage,
			String leaveMessage,
			Map<Integer, MenuOperation> operations
	) {
		this.inputScanner = inputScanner;
		this.welcomeMessage = welcomeMessage;
		this.leaveMessage = leaveMessage;
		this.operations = operations;
	}

	public void run() {
		printWelcome();
		readInput();
		if (leaveMessage != null) {
			System.out.println(leaveMessage);
		}
	}

	private void printWelcome() {
		System.out.println(welcomeMessage);
	}

	private void readInput() {
		while (!exitRequested && inputScanner.hasNext()) {
			if (isExitCommand()) {
				inputScanner.next();
				exitRequested = true;
				break;
			} else if (isBackCommand()) {
				inputScanner.next();
				System.out.println("Выход в предыдущее меню");
				break;
			} else if(isHelpCommand()) {
				inputScanner.next();
				printWelcome();
				continue;
			} else if (inputScanner.hasNextInt()) {
				var operationId = inputScanner.nextInt();
				if(operations.containsKey(operationId)) {
					operations.get(operationId).perform(inputScanner);
				} else {
					System.out.println("Неизвестный код команды");
				}
			} else {
				inputScanner.next();
				System.out.println("Некорректный ввод");
				continue;
			}

			if(!exitRequested) {
				System.out.println("Введите новую команду");
			}
		}
	}

	private boolean isHelpCommand() {
		return inputScanner.hasNext(HELP_INPUT);
	}

	private boolean isExitCommand() {
		return inputScanner.hasNext(EXIT_INPUT);
	}

	private boolean isBackCommand() {
		return inputScanner.hasNext(BACK_INPUT);
	}

}
