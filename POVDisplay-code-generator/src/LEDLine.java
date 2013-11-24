
public class LEDLine {
	
	boolean[] ledSequence = {false, false, false, false, false, false, false, false};
	
	public LEDLine() {
		
	}
	public LEDLine(boolean[] leds) {
		ledSequence = leds;
	}
	public void setLine(boolean[] leds) {
		ledSequence = leds;
	}
	public boolean[] getLine() {
		return ledSequence;
	}
}
