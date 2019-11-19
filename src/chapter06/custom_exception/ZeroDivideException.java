package chapter06.custom_exception;

public class ZeroDivideException extends Exception {
	private static final long serialVersionUID = 1L;
	public ZeroDivideException() {
		super();
	}
	public ZeroDivideException(String msg) {
		super(msg);
	}
	public ZeroDivideException(Throwable cause) {
		super(cause);
	}
	public ZeroDivideException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
