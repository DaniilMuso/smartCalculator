package platformCalculator;

import java.util.NoSuchElementException;
import java.util.Scanner;

abstract class triangleShapes extends shapes{
	protected double sideThree;
	private double sTringle;
	private double perimetrTringle;

	public double getSideThree() {
		return sideThree;
	}

	abstract void setSideThree(double sideThree) throws shapesException;
	
	public double getsTringle() {
		return sTringle;
	}

	public void setsTringle(double sTringle) {
		this.sTringle = sTringle;
	}

	public double getPerimetrTringle() {
		return perimetrTringle;
	}

	public void setPerimetrTringle(double perimetrTringle) {
		this.perimetrTringle = perimetrTringle;
	}
}

class  triangle extends  triangleShapes {
	@Override
	void setSideThree(double sideThree) throws shapesException {
		if (sideThree <= 0) {
			throw new shapesException("Нельзя вводить значение равную нулю или ниже нуля.");
		}
		this.sideThree = sideThree;
	}
	public void tringleStart() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|================ТРЕУГОЛЬНИК=================|");
		System.out.println("|============================================|");
		System.out.println("|Чтобы найти площадь треугольника введите (1)|");
		System.out.println("|, чтобы найти периметр нажмите (2), чтобы в-|");
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
			tringleStart();
			input.close();
		} catch (NoSuchElementException ea) {
			System.err.println("Вы ввели неккоретное значение, повторите ещё раз.");
			tringleStart();
			input.close();
		}
	}
	
	@Override 
	public void sShapes() {
		System.out.println(" ____________________________________________ ");
		System.out.println("|============================================|");
		System.out.println("|==================ПЛОЩАДЬ===================|");
		System.out.println("|============================================|");
		System.out.println("|================ТРЕУГОЛЬНИКА================|");
		System.out.println("|============================================|");
		System.out.println("|=============ВВЕДИТЕ ТРИ СТОРОНЫ============|");
		System.out.println("|============================================|");
		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
		triangle t = new triangle();
		Scanner input = new Scanner(System.in);
		try {
			String inputStringOne = input.next();
			String inputStringTwo = input.next();
			String inputStringThree = input.next();
			Double inputDoubleOne = Double.parseDouble(inputStringOne);
			Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
			Double inputDoubleThree = Double.parseDouble(inputStringThree);
			t.setSideOne(inputDoubleOne);
			t.setSideTwo(inputDoubleTwo);
			t.setSideThree(inputDoubleThree);
			double formulaGeronaP = (t.getSideOne() + t.getSideTwo() + t.getSideThree()) / 2;
			double formulaGeronaS = Math.sqrt(formulaGeronaP * (formulaGeronaP - t.getSideOne()) * (formulaGeronaP - t.getSideTwo()) * (formulaGeronaP - t.getSideThree()));
			System.out.println("Площадь равна: " + formulaGeronaS);
			t.setsTringle(formulaGeronaS);
			System.out.println("Первая сторона равна: " + t.getSideOne() + ", вторая сторона равна: " + t.getSideTwo() +
					", третья сторона равна: " + t.getSideThree() + ". Площадь равна: " + formulaGeronaS + ". P по формуле Герона равна: " + formulaGeronaP + ".");
			tringleStart();
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
		triangle t = new triangle();
		Scanner input = new Scanner(System.in);
		try {
			String inputStringOne = input.next();
			String inputStringTwo = input.next();
			String inputStringThree = input.next();
			Double inputDoubleOne = Double.parseDouble(inputStringOne);
			Double inputDoubleTwo = Double.parseDouble(inputStringTwo);
			Double inputDoubleThree = Double.parseDouble(inputStringThree);
			t.setSideOne(inputDoubleOne);
			t.setSideTwo(inputDoubleTwo);
			t.setSideThree(inputDoubleThree);
			double perimetrT = t.getSideOne() + t.getSideTwo() + t.getSideThree();
			System.out.println("Периметр равен: " + perimetrT);
			t.setPerimetrTringle(perimetrT);
			System.out.println("Первая сторона равна: " + t.getSideOne() + ", вторая сторона равна: " + t.getSideTwo() +
					", третья сторона равна: " + t.getSideThree() + ". Периметр равен: " + perimetrT + ".");
			tringleStart();
			t= null;
			input.close();
		} catch (shapesException e) {
			System.err.println("Нельзя вводить число равную нулю или меньшее нулю, повторите ещё раз.");
			sShapes();
			t = null;
			input.close();
		}
	}
}
