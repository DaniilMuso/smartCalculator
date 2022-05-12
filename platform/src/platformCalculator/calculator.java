package platformCalculator;

import java.util.Scanner;

public class calculator {
	public void summa() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================СЛОЖЕНИЕ==================|");
		System.out.println("|============================================|");
		System.out.println("|Введите два числа, чтобы сложить.           |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputStringOne = input.next();
		String inputStringTwo = input.next();
		Double inputDoubleOne = Double.parseDouble(inputStringOne);
		Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
		double summa = inputDoubleOne + inputDoubleTwo;
		System.out.println("Сумма равна: " + summa);
		startPlatform.start();
		input.close();
	}
	
	public void minus() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================ВЫЧИТАНИЕ=================|");
		System.out.println("|============================================|");
		System.out.println("|Введите два числа, чтобы вычесть.           |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputStringOne = input.next();
		String inputStringTwo = input.next();
		Double inputDoubleOne = Double.parseDouble(inputStringOne);
		Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
		double minus = inputDoubleOne - inputDoubleTwo;
		System.out.println("Вычитание равно: " + minus);
		startPlatform.start();
		input.close();
	}
	
	public void umnoj() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================УМНОЖЕНИЕ=================|");
		System.out.println("|============================================|");
		System.out.println("|Введите два числа, чтобы умножить.          |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputStringOne = input.next();
		String inputStringTwo = input.next();
		Double inputDoubleOne = Double.parseDouble(inputStringOne);
		Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
		double umnoj = inputDoubleOne * inputDoubleTwo;
		System.out.println("Ответ равен: " + umnoj);
		startPlatform.start();
		input.close();
	}
	
	public void delenie() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|===================ДЕЛЕНИЕ==================|");
		System.out.println("|============================================|");
		System.out.println("|Введите два числа, чтобы поделить.          |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputStringOne = input.next();
		String inputStringTwo = input.next();
		Double inputDoubleOne = Double.parseDouble(inputStringOne);
		Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
		double delenie = inputDoubleOne / inputDoubleTwo;
		if (inputDoubleOne == 0 || inputDoubleTwo == 0) {
			System.out.println("Ответ равен: " + 0);
			startPlatform.start();
			input.close();
		}
		System.out.println("Ответ равна: " + delenie);
		startPlatform.start();
		input.close();
	}
	
	public void rasingToTheRoot() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|=============ВОЗВЕДЕНИЕ В КОРЕНЬ============|");
		System.out.println("|============================================|");
		System.out.println("|Введите число, чтобы возвести в корень.     |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputStringOne = input.next();
		Double inputDoubleOne = Double.parseDouble(inputStringOne);
		double rasingToTheRoot = inputDoubleOne * inputDoubleOne;
		System.out.println("Корень равен: " + rasingToTheRoot);
		startPlatform.start();
		input.close();
	}
	
	public void reverseRoot() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|===============ОБРАТНЫЙ КОРЕНЬ==============|");
		System.out.println("|============================================|");
		System.out.println("|Введите число, для обратного возведения к-|");
		System.out.println("|орня.                                      |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		Scanner input = new Scanner(System.in);
		String inputStringOne = input.next();
		Double inputDoubleOne = Double.parseDouble(inputStringOne);
		double reverseRoot = Math.sqrt(inputDoubleOne);
		System.out.println("Обратное возведение корня равно: " + reverseRoot);
		startPlatform.start();
		input.close();
	}
}
