package jrout.tutorial.onlineshopping.exception;

public class OnlineShoppingException extends RuntimeException {
	private String message;

	public OnlineShoppingException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
