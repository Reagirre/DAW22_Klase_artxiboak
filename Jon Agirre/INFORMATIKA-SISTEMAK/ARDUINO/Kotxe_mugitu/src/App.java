import cc.arduino.*;

Arduino arduino = new Arduino(this, Arduino.list()[0], 57600);

void setup() {
  arduino.pinMode(13, Arduino.OUTPUT);
}

void loop() {
  arduino.digitalWrite(13, Arduino.HIGH);
}

