
public class NotSufficientFundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String message; public NotSufficientFundException(String string, String message) 
	{  
		this.message = message;
	} 
	public NotSufficientFundException(Throwable cause, String message) { 
		super(cause); 
		this.message = message; 
		} 
	public String getMessage() { 
		return message; 
		} 

	
}
