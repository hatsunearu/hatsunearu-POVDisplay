final static int INTERLINE_DELAY = 2; //delay in ms between vertical lines
final static int INTERCHARACTER_DELAY = 7; //delay between character
final static int SPACE_DELAY = 15; //delay for one space
final static int NUM_OF_LEDS = 8;

void setup() {
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  delay(500);
}

void loop() {
  checkButton();  
}

void checkButton() {
  if(digitalRead(12) == LOW) {
    displayMessage();
  }
  delay(100);
}

void displayMessage() {
	dispLine(&{0,0,1,1,1,1,1,1});
	dispLine{&{0,1,0,1,0,0,0,0});
	dispLine{&{1,0,0,1,0,0,0,0});
	delay(500);
}

void dispLine(int *a) {
	
	for(int *b=a; b-a<8; b++) {
		if(*a) {
			digitalWrite(( (b-a) + 2), HIGH);
		}
		else {
			digitalWrite(( (b-a) + 2), LOW);
		}
	}
	delay(INTERLINE_DELAY);
}

void dispCharDelay() {
	delay(INTERCHARACTER_DELAY);
}

void dispSpace() {
	delay(SPACE_DELAY);
}
