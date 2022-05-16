package platformcalculator;

public class Calculator {

    public double summ(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws platformcalculator.CalculationException {
        if(b == 0.d) {
            throw new platformcalculator.CalculationException("Ошибка: деление на ноль");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqroot(double a) {
        return Math.sqrt(a);
    }

//
//	public void rasingToTheRoot() {
//		System.out.println(" ____________________________________________ ");
//		System.out.println("|============================================|");
//		System.out.println("|=============ВОЗВЕДЕНИЕ В КОРЕНЬ============|");
//		System.out.println("|============================================|");
//		System.out.println("|Введите число, чтобы возвести в корень.     |");
//		System.out.println("|============================================|");
//		System.out.println("|============================================|");
//		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
//		Scanner input = new Scanner(System.in);
//		String inputStringOne = input.next();
//		Double inputDoubleOne = Double.parseDouble(inputStringOne);
//		double rasingToTheRoot = inputDoubleOne * inputDoubleOne;
//		System.out.println("Корень равен: " + rasingToTheRoot);
////		CliMenu.start();
//		input.close();
//	}
//
//	public void reverseRoot() {
//		System.out.println(" ____________________________________________ ");
//		System.out.println("|============================================|");
//		System.out.println("|===============ОБРАТНЫЙ КОРЕНЬ==============|");
//		System.out.println("|============================================|");
//		System.out.println("|Введите число, для обратного возведения к-|");
//		System.out.println("|орня.                                      |");
//		System.out.println("|============================================|");
//		System.out.println("|============================================|");
//		System.out.println(" ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ ");
//		Scanner input = new Scanner(System.in);
//		String inputStringOne = input.next();
//		Double inputDoubleOne = Double.parseDouble(inputStringOne);
//		double reverseRoot = Math.sqrt(inputDoubleOne);
//		System.out.println("Обратное возведение корня равно: " + reverseRoot);
////		CliMenu.start();
//		input.close();
//	}
}
