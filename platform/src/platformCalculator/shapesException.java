package platformCalculator;

public class shapesException extends Exception{

	private static final long serialVersionUID = 4251394454053446668L;

	public shapesException() {
		
	}
	
	public shapesException(String message) {
        super(message);
    }
	
	 public shapesException(String message, Throwable cause) {
	        super(message, cause);
	 }
	 
	 public shapesException(Throwable cause) {
	        super(cause);
	 }
	 
	 protected shapesException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
		 	super(message, cause, enableSuppression, writableStackTrace);
}
}
