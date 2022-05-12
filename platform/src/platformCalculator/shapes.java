package platformCalculator;

public class shapes {
	private double sideOne;
	private double sideTwo;
	
	public double getSideOne() {
		return sideOne;
	}
	public void setSideOne(double sideOne) throws shapesException {
		if (sideOne <= 0) {
			throw new shapesException("Нельзя вводить значение равную нулю или ниже нуля.");
		}
		this.sideOne = sideOne;
	}
	public double getSideTwo() {
		return sideTwo;
	}
	public void setSideTwo(double sideTwo) throws shapesException {
		if (sideTwo <= 0) {
			throw new shapesException("Нельзя вводить значение равную нулю или ниже нуля.");
		}
		this.sideTwo = sideTwo;
	}
	
	public void sShapes() {
		
	}
	
	public void perimetrShapes() {
		
	}
}
