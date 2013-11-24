import java.util.ArrayList;


public class Tester {
	public static void main(String[] args) {
		CharacterFont cGen = new CharacterFont();
		
		String s = "AB";
		
		//s = new StringBuilder(s).reverse().toString();
		
		ArrayList<LEDLine> lines = new ArrayList<LEDLine>();
		
		char[] charMessage = s.toLowerCase().toCharArray();
		
		for(char c : charMessage) {
			LEDLine[] LEDSequenceChar = cGen.toLines(c);
			for(LEDLine l : LEDSequenceChar) {
				lines.add(l);
			}
		}
		
		System.out.print("\n\n");
		
		for(LEDLine e:lines) {	
			for(boolean b:e.getLine()) {
				if(b)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
