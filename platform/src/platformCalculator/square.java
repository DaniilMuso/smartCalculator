package platformCalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class square extends shapes {
	private double sSquare;
	private double perimetrSquare;
	
	public double getsSquare() {
		return sSquare;
	}
	public void setsSquare(double sSquare) {
		this.sSquare = sSquare;
	}
	public double getPerimetrSquare() {
		return perimetrSquare;
	}
	public void setPerimetrSquare(double perimetrSquare) {
		this.perimetrSquare = perimetrSquare;
	}
	
	public void squareStart() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================КВАДРАТА==================|");
		System.out.println("|============================================|");
		System.out.println("|Чтобы найти площадь квадрата введите (1),   |");
		System.out.println("|чтобы найти периметр нажмите (2), чтобы в-  |");
		System.out.println("|ыйти в главное меню, нажмите (3). Если хоти-|");
		System.out.println("|те выключить приложение, напишите (off).    |");
		System.out.println("|============================================|");
		System.out.println("|============================================|");
		System.out.println("|1.Найти площадь.                            |");
		System.out.println("|2.Найти периметр.                           |");
		System.out.println("|3.Выйти в главное меню.                     |");
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
				sShapes();
				input.close();
			} else if (inputInteger == 2) {
				perimetrShapes();
				input.close();
			} else if (inputInteger == 3) {
				startPlatform.start();
				input.close();
			} else {
				startPlatform.start();
				input.close();
			}
		} catch (NumberFormatException e) {
			System.err.println("Вы ввели неккоретное значение, повторите ещё раз.");
			squareStart();
			input.close();
		} catch (NoSuchElementException ea) {
			System.err.println("Вы ввели неккоретное значение, повторите ещё раз.");
			squareStart();
			input.close();
		}
	}
	
	@Override 
	public void sShapes() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================ПЛОЩАДЬ===================|");
		System.out.println("|============================================|");
		System.out.println("|==================КВАДРАТА==================|");
		System.out.println("|============================================|");
		System.out.println("|=============ВВЕДИТЕ ТРИ СТОРОНЫ============|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		square t = new square();
		Scanner input = new Scanner(System.in);
		try {
			String inputStringOne = input.next();
			Double inputDoubleOne = Double.parseDouble(inputStringOne);
			t.setSideOne(inputDoubleOne);
			double sT = t.getSideOne() * t.getSideOne();
			System.out.println("Площадь равна: " + sT);
			t.setsSquare(sT);
			System.out.println("Первая сторона равна: " + t.getSideOne() + ". Площадь равна: " + sT + ".");
			squareStart();
			t = null;
			input.close();
		} catch (shapesException e) {
			System.err.println("Нельзя вводить число равную нулю или меньшее нулю, повторите ещё раз.");
			sShapes();
			t = null;
			input.close();
		}
	}
	
	@Override 
	public void perimetrShapes() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================ПЕРИМЕТР==================|");
		System.out.println("|============================================|");
		System.out.println("|==================КВАДРАТА==================|");
		System.out.println("|============================================|");
		System.out.println("|============ВВЕДИТЕ ОДНУ СТОРОНУ============|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		square t = new square();
		Scanner input = new Scanner(System.in);
		try {
			String inputStringOne = input.next();
			Double inputDoubleOne = Double.parseDouble(inputStringOne);
			t.setSideOne(inputDoubleOne);
			double perimetrT = t.getSideOne() * 4;
			System.out.println("Периметр равен: " + perimetrT);
			t.setPerimetrSquare(perimetrT);
			System.out.println("Первая сторона равна: " + t.getSideOne() + ". Периметр равен: " + perimetrT + ".");
			squareStart();
			t = null;
			input.close();
		} catch (shapesException e) {
			System.err.println("Нельзя вводить число равную нулю или меньшее нулю, повторите ещё раз.");
			sShapes();
			t = null;
			input.close();
		}
	}
}
