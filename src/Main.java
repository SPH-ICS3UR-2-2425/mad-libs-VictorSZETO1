
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program Author: Victor Class: ICS3U Date: Sept. 16, 2024 Make a
		 * program that asks for 10 inputs reads them into variables, and then prints
		 * out a story Make sure to include Strings, ints, and doubles!
		 */
		Scanner in = new Scanner(System.in);

		System.out.println("What Is Your Name?");
		String name = in.nextLine();
		System.out.println("ok " + name + " on a scale of 1 to 10 how strong are you?");
		int str = in.nextInt();

		in.nextLine();

		System.out.println("ok " + name + " name a noun");
		String noun1 = in.nextLine();

		System.out.println("ok " + name + " name another noun");
		String noun2 = in.nextLine();

		System.out.println("ok " + name + " name a last noun");
		String noun3 = in.nextLine();

		System.out.println("ok " + name + " name a adjective");
		String verb1 = in.nextLine();

		System.out.println("ok " + name + " name a second adjective");
		String verb2 = in.nextLine();

		System.out.println("ok " + name + " name a last adjective");
		String verb3 = in.nextLine();

		System.out.println("ok " + name + " who is your best friend");
		String name2 = in.nextLine();

		System.out.println("ok " + name + " what is a cool verb ending with ing");
		String verb = in.nextLine();

		System.out.println("ok " + name + " lastly an animal");
		String pet = in.nextLine();

		if (str <= 7) {
			System.out.println("on the way home from school " + name + " stopped by the");
			System.out.println(verb1 + " " + noun1 + " and decided to see if they had any " + verb2 + " " + noun2);
			System.out.println("but while " + name + " was looking around he saw his best frind " + name2 + " " + verb
					+ " a " + pet);
			System.out.println(
					"since " + name + " is a solid " + str + "/10 in strength he decides to punch his friend since "
							+ pet + " is his favorite animal however he is too weak and gets knocked out");
			System.out.println("the last thing " + name + " saw was a " + verb3 + " " + noun3);
		}
		if (str > 10) {
			System.out.println("ok " + name + " you're to strong for the program :( (score to high " + str + "/10)");

		}

		{
			if (str > 7) {
				System.out.println("on the way home from school " + name + " stopped by the");
				System.out.println(verb1 + " " + noun1 + "and decided to see if they had any " + verb2 + " " + noun2);
				System.out.println("but while " + name + " was looking around he saw his best frind" + name2 + " "
						+ verb + " a " + pet);
				System.out.println("since " + name + " is a solid " + str + "/10 in strength "
						+ "he decides to punch his friend since " + pet + " is his favorite animal,");
				System.out.println("Since " + name + " is so Strong He punches " + name2 + " And knockes him out cold");
				System.out.println(name + " Procedes to mock " + name2 + " Calling Him a " + verb3 + " " + noun3);
				in.close();
			}
		}
		double randomValue = Math.random();
		
		if (randomValue <0.25) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("this message had a 25% of existing you got lucky!!");
			
		}else {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("no secret message :(   "+randomValue);
		}
			
	}
}

