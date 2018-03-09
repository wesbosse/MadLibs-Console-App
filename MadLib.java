import java.io.Console;

public class MadLib {
	public static void main(String[] args) {
		Console console = System.console();

		String name = console.readLine("Enter a name:  ");
		String adjective = console.readLine("Enter an adjective:  ");
		String noun = console.readLine("Enter a noun:  ");
		String adverb = console.readLine("Enter an adverb:  ");
		String verb = console.readLine("Enter a verb ending with -ing:  ");

		console.printf("||----- Your Story -----||");
		console.printf("%s is a %s %s. They are always %s %s.", name, adjective, noun, adverb, verb);
	}
}