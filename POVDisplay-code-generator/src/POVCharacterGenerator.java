import java.util.ArrayList;


public class POVCharacterGenerator {
	
	ArrayList<LEDLine> sequence = new ArrayList<LEDLine>();
	CharacterFont font = new 
	
	public POVCharacterGenerator() {
		
	}
	
	public POVCharacterGenerator(String s) {
		this.addString(s);
	}
	
	public LEDLine[] getSequence() {
		LEDLine[] seq = new LEDLine[sequence.size()];
		for(int i=0; i<seq.length; i++) 
			seq[i] = sequence.get(i);
		return seq;
	}
	
	public void addSpace() {
		for(int i=0;i<=5;i++) {
			sequence.add(new LEDLine());
		}
	}
	
	public void addChar(char c) {
		sequence.addall()
		case 'a':
			sequence.add(new LEDLine());
		}
	}
	
	public void addString(String s) {
		char[] message = s.toCharArray();
		for(char e: message) 
			addChar(e);
	}
	
	
}
