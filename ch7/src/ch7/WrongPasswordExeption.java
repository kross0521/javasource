package ch7;

public class WrongPasswordExeption extends Exception {

	public WrongPasswordExeption() {
		super();
	}

	public WrongPasswordExeption(String message) {
		super(message);
	}

}
