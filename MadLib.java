import java.io.Console;

public class MadLib {
	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine("What is your name? ");
		console.printf("Hello %s!\n", name);

	}
}