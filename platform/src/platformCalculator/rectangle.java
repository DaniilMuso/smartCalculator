package platformCalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class rectangle extends shapes{
	private double sRectangle;
	private double perimetrRectangle;
	
	public double getsRectangle() {
		return sRectangle;
	}
	
	public void setsRectangle(double sRectangle) {
		this.sRectangle = sRectangle;
	}
	
	public double getPerimetrRectangle() {
		return perimetrRectangle;
	}
	
	public void setPerimetrRectangle(double perimetrRectangle) {
		this.perimetrRectangle = perimetrRectangle;
	}
	
	public void rectangleStart() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|===============ПРЯМОУГОЛЬНИК================|");
		System.out.println("|============================================|");
		System.out.println("|Чтобы найти площадь прямоугольника введите  |");
		System.out.println("|(1), чтобы найти периметр нажмите (2), чтобы|");
		System.out.println("|выйти в главное меню, нажмите (3). Если хот-|");
		System.out.println("|ите выключить приложение, напишите (off).   |");
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
			rectangleStart();
			input.close();
		} catch (NoSuchElementException ea) {
			System.err.println("Вы ввели неккоретное значение, повторите ещё раз.");
			rectangleStart();
			input.close();
		}
	}
	
	@Override 
	public void sShapes() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================ПЛОЩАДЬ===================|");
		System.out.println("|============================================|");
		System.out.println("|================ПРЯМОУГОЛЬНИКА==============|");
		System.out.println("|============================================|");
		System.out.println("|=============ВВЕДИТЕ ДВЕ СТОРОНЫ============|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		rectangle t = new rectangle();
		Scanner input = new Scanner(System.in);
		try {
			String inputStringOne = input.next();
			String inputStringTwo = input.next();
			Double inputDoubleOne = Double.parseDouble(inputStringOne);
			Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
			t.setSideOne(inputDoubleOne);
			t.setSideTwo(inputDoubleTwo);
			double sT = t.getSideOne() * t.getSideTwo();
			System.out.println("Площадь равна: " + sT);
			t.setsRectangle(sT);
			System.out.println("Первая сторона равна: " + t.getSideOne() + ", вторая сторона равна: " + t.getSideTwo() +
					". Площадь равна: " + sT + ".");
			rectangleStart();
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
		System.out.println("|================ТРЕУГОЛЬНИКА================|");
		System.out.println("|============================================|");
		System.out.println("|=============ВВЕДИТЕ ТРИ СТОРОНЫ============|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		rectangle t = new rectangle();
		Scanner input = new Scanner(System.in);
		try {
			String inputStringOne = input.next();
			String inputStringTwo = input.next();
			Double inputDoubleOne = Double.parseDouble(inputStringOne);
			Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
			t.setSideOne(inputDoubleOne);
			t.setSideTwo(inputDoubleTwo);
			double perimetrT = (t.getSideOne() + t.getSideTwo()) * 2;
			System.out.println("Периметр равен: " + perimetrT);
			t.setPerimetrRectangle(perimetrT);
			System.out.println("Первая сторона равна: " + t.getSideOne() + ", вторая сторона равна: " + t.getSideTwo() +
					". Периметр равен: " + perimetrT + ".");
			rectangleStart();
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
