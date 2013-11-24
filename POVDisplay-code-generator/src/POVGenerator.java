import java.util.ArrayList;
import java.util.Scanner;


public class POVGenerator {
	
	static Scanner s = new Scanner(System.in);
	static CharacterFont cf = new CharacterFont();
	static ArrayList<LEDLine> LEDMessage;
	
	final static String uppercode = 
			"void setup() {                   \n" +
			"	for(int i=2; i<10; i++) {     \n" +
			"		pinMode(i, OUTPUT);       \n" +
			"	}                             \n" +
			"pinMode(12, INPUT);              \n" +
			"delay(500);                      \n" +
			"}                                \n" +
			"void loop() {                    \n" +
			"	checkButton();                \n" +
			"}                                \n" +
			"void checkButton() {             \n" +
			"	if(digitalRead(12) == LOW)    \n" +
			"		displayMessage();         \n" +
			"	delay(100);                   \n" +
			"}                                \n" +
			"void dispLine(boolean l1, boolean l2, boolean l3, boolean l4, boolean l5, boolean l6, boolean l7, boolean l8 ) { \n" +
			"	digitalWrite(2, l8);          \n" +
			"	digitalWrite(3, l7);          \n" +
			"	digitalWrite(4, l6);          \n" +
			"	digitalWrite(5, l5);          \n" +
			"	digitalWrite(6, l4);          \n" +
			"	digitalWrite(7, l3);          \n" +
			"	digitalWrite(8, l2);          \n" +
			"	digitalWrite(9, l1);          \n" +
			"	delay(10);                    \n" +
			"}                                \n" +
			"void displayMessage() {";
	
	
	public static void main(String[] args) {
		System.out.println("Input text to print:");
		String message = s.nextLine();
		LEDMessage = cf.stringToLines(message);
		
		System.out.println("ARDUINO CODE: \n\n\n");
		displayUpperCode();
		displayLowerCode();
		
	}
	public static void displayUpperCode() {
		System.out.println(uppercode);
	}
	public static void displayLowerCode() {
		for(LEDLine e: LEDMessage) {
			boolean[] booleanMessage = e.getLine();
			System.out.print("	dispLine(");
			for(int i = 0; i < booleanMessage.length - 1; i++) {
				System.out.print(booleanMessage[i]+", ");
			}
			System.out.println(booleanMessage[booleanMessage.length - 1] + ");");
		}
		System.out.println("}");
	}
}
