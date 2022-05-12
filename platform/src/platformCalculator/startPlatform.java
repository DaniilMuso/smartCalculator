package platformCalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class startPlatform {
	public static void start() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|=================КАЛЬКУЛЯТОР================|");
		System.out.println("|============================================|");
		System.out.println("|Привет мой дорогой друг, я умный калькулятор|");
		System.out.println("|если тебе нужно обычное сложение, умножение,|");
		System.out.println("|и т.д., то вы выбире 1 до 6. Если тебе нужно|");
		System.out.println("|найти площадь, периметр фигур, то выбери от |");
		System.out.println("|7 до 9. Если хотите выключить приложение на-|");    
		System.out.println("|жмите (off).                                |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println("|1.Сложение.                                 |");
		System.out.println("|2.Вычитание.                                |");
		System.out.println("|3.Умножение.                                |");
		System.out.println("|4.Деление.                                  |");
		System.out.println("|5.Возведение в корень.                      |");
		System.out.println("|6.Извлечение корня.                         |"); 
		System.out.println("|============================================|");
		System.out.println("|==================ФИГУРЫ====================|");
		System.out.println("|============================================|");
		System.out.println("|7.Прямоугольник.                            |");
		System.out.println("|8.Треугоольника.                            |");
		System.out.println("|9.Квадрат.                                  |");
		System.out.println("|============================================|");
		System.out.println("|===============ВВЕДИТЕ НОМЕР================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputString = input.next();
		if (inputString.equals("off")) {
			System.exit(0);
		}
		try {
			Integer inputInteger = Integer.parseInt(inputString);
			if (inputInteger == 1) {
				calculator t = new calculator();
				t.summa();
				t = null;
				input.close();
			} else if (inputInteger == 2) {
				calculator t = new calculator();
				t.minus();
				t = null;
				input.close();
			} else if (inputInteger == 3) {
				calculator t = new calculator();
				t.umnoj();
				t = null;
				input.close();
			} else if (inputInteger == 4){
				calculator t = new calculator();
				t.delenie();
				t = null;
				input.close();
			} else if (inputInteger == 5) {
				calculator t = new calculator();
				t.rasingToTheRoot();
				t = null;
				input.close();
			} else if (inputInteger == 6) {
				calculator t = new calculator();
				t.reverseRoot();
				t = null;
				input.close();
			} else if (inputInteger == 7) {
				rectangle t = new rectangle();
				t.rectangleStart();
				t = null;
				input.close();
			} else if (inputInteger == 8) {
				triangle t = new triangle();
				t.tringleStart();
				t = null;
				input.close();
			} else if (inputInteger == 9) {
				square t = new square();
				t.squareStart();
				t = null;
				input.close();
			} else {
				System.exit(0);
			}
			
		} catch (NumberFormatException e) {
			System.err.println("Вы ввели неккоретное значение, повторите ещё раз.");
			start();
			input.close();
		} catch (NoSuchElementException ea) {
			System.err.println("Вы ввели неккоретное значение, повторите ещё раз.");
			start();
			input.close();
		}
		 
	}
}
