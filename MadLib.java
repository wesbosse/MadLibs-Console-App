import java.io.Console;
import java.util.Random;

public class MadLib {

	// public static String adj(Console console) {
	// 	String adjective = console.readLine("Enter an adjective:  ");
	// 	return adjective;
	// }
	// public static String noun(Console console) {
	// 	String noun = console.readLine("Enter a noun:  ");
	// 	return noun;
	// }
	// public static String adv(Console console) {
	// 	String adverb = console.readLine("Enter an adverb:  ");
	// 	return adverb;
	// }
	// public static String verb(Console console) {
	// 	String verb = console.readLine("Enter a verb ending with -ing:  ");
	// 	return verb;
	// }

	public static String buildStory() {
		Random randomNumber = new Random();
		Console console = System.console();
		int storySelector = randomNumber.nextInt(4);
		console.printf("%s", storySelector);
		console.printf("\n");
		return "hello";
	}

	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine("Enter a name:  ");
	

		console.printf(buildStory());
		console.printf("\n");
		// console.printf("yo");
	}
}