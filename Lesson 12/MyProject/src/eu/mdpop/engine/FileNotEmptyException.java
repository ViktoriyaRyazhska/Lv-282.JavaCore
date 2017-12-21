package eu.mdpop.engine;

public class FileNotEmptyException extends RuntimeException {

	public FileNotEmptyException(String arg) {
		super(arg);
	}

	public FileNotEmptyException() {
	}
}
