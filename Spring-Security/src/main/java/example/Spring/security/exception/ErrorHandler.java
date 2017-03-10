package example.Spring.security.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex) {
		ex.printStackTrace();
		return "error";
	}
	
}
