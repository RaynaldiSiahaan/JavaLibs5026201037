import java.util.Scanner;

public class JavaLibs5026201037 {
	public static void main(String[] args) {
		Scanner palpale = new Scanner (System.in);

System.out.println("Where are you from? : ");
String place = palpale.next();

System.out.println("Can you guess my name? : ");
String name = palpale.next();

System.out.println("Do you know what year is it now? : ");
int year = palpale.nextInt();

System.out.println("Tell me your birth year : ");
int birth = palpale.nextInt();

System.out.println("I see, let's test your math skill, tell me any number with one number behind comma : ");
double math = palpale.nextDouble();

System.out.println("Pick another one: ");
double number = palpale.nextDouble(); 

System.out.println("Not enough, i need more information, name any food : ");
String food = palpale.next();

System.out.println("Interesting, how about guns? : ");
String guns = palpale.next();

System.out.println("Why you ask? Do you know how many guns i have? : ");
int gun = palpale.nextInt();

System.out.println("Hah, wrong. Now for the final question, what is your name? : ");
String Myname = palpale.next();

int year_birth = year - birth;
double dmath = math - number;

System.out.println("Well, " + Myname );
System.out.print("many years have passed since that war and i guess you are " + year_birth);
System.out.print(" years old. ");
System.out.println("I'm sorry, my name is not " + name );
System.out.print("like you guessed.");
System.out.println(" At least you are pretty intelligent.");
System.out.println("Hmm, " + dmath);
System.out.print("? Interesting.");
System.out.println(" Oh, dont worry, i dont have any " + guns);
System.out.print(", infact, I don't have any guns. ");
System.out.println("So you like " + food );
System.out.print("too? Heh, same.");
System.out.println(" Dont worry, you won't find any " + gun );
System.out.print("here, they are too old.");
System.out.println(" Welcome to the future kids, not as great as you expected.");

		palpale.close();
	}
}