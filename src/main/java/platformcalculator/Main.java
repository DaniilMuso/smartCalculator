package platformcalculator;

import java.util.Map;
import java.util.Scanner;

public class Main {

	private static final Calculator CALCULATOR = new Calculator();
	private static final String EXIT_HINT = "Если хотите выключить приложение, введите " + CliMenu.EXIT_INPUT + ".";
	private static final String BACK_HINT = "Для возврата в предыдущее меню введите " + CliMenu.BACK_INPUT + ".";
	private static final String HELP_HINT = "Для вывода справки введите " + CliMenu.HELP_INPUT + ".";
	private static final String MAIN_MENU_MESSAGE = MessageBlock.builder()
			.setHeader("КАЛЬКУЛЯТОР")
			.addSection(
					"Привет мой дорогой друг, я умный калькулятор если тебе нужно обычное сложение, умножение, " +
							"и т.д., то вы выбери 1 до 6. Если тебе нужно найти площадь, периметр фигур, то выбери от " +
							"7 до 9.", HELP_HINT, EXIT_HINT
			)
			.addSection(
					"1.Сложение.", "2.Вычитание.", "3.Умножение.", "4.Деление.", "5.Возведение в корень.",
					"6.Извлечение корня.", "7.Прямоугольник.", "8.Треугольника.", "9.Квадрат."
			)
			.setFooter("ВВЕДИТЕ НОМЕР")
			.build()
			.toString();
	private static final String RECTANGLE_WELCOME_MESSAGE = MessageBlock.builder()
			.setHeader("ПРЯМОУГОЛЬНИК")
			.addSection(
					"Чтобы найти площадь прямоугольника введите (1), чтобы найти периметр нажмите (2), чтобы " +
							"выйти в главное меню, нажмите (3).", HELP_HINT, BACK_HINT, EXIT_HINT
			)
			.addSection("1.Найти площадь.", "2.Найти периметр.", "3.Выйти в главное меню.")
			.setFooter("ВВЕДИТЕ НОМЕР")
			.build()
			.toString();
	private static final String TRIANGLE_WELCOME_MESSAGE = MessageBlock.builder()
			.setHeader("ТРЕУГОЛЬНИК")
			.addSection(
					"Чтобы найти площадь треугольника введите (1), чтобы найти периметр нажмите (2), чтобы " +
							"выйти в главное меню, нажмите (3).", HELP_HINT, BACK_HINT, EXIT_HINT
			)
			.addSection("1.Найти площадь.", "2.Найти периметр.", "3.Выйти в главное меню.")
			.setFooter("ВВЕДИТЕ НОМЕР")
			.build()
			.toString();

	public static Calculator getCalculator() {
		return CALCULATOR;
	}

	public static void main(String[] args) {
		try (Scanner inputScanner = new Scanner(System.in)) {
			newMainMenu(inputScanner).run();
			System.out.println("Спасибо, что воспользовались калькулятором и до новых встреч");
		}
	}

	private static CliMenu newMainMenu(Scanner inputScanner) {
		return new CliMenu(
				inputScanner,
				MAIN_MENU_MESSAGE,
				null,
				Map.of(
						1, new SummationOperation(),
						2, new SubtractionOperation(),
						3, new MultiplicationOperation(),
						4, new DivisionOperation(),
						7, newRectangleMenu(inputScanner),
						8, newTriangleMenu(inputScanner)
				)
		);
	}

	private static MenuOperation newRectangleMenu(Scanner inputScanner) {
		return new NestedMenu(new CliMenu(
				inputScanner,
				RECTANGLE_WELCOME_MESSAGE,
				null,
				Map.of()
		));
	}

	private static MenuOperation newTriangleMenu(Scanner inputScanner) {
		return new NestedMenu(new CliMenu(
				inputScanner,
				TRIANGLE_WELCOME_MESSAGE,
				null,
				Map.of()
		));
	}

}
