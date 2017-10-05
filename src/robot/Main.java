package robot;

import lejos.robotics.subsumption.*;

public class Main {
	public static void main(String[] args) {
		TouchSensor tSensor = new TouchSensor("S2");
		BottomMotor bMotor = new BottomMotor(tSensor);
		MiddleMotor mMotor = new MiddleMotor();
		TopMotor tMotor = new TopMotor();

		bMotor.rotateToDefaultPos();
		mMotor.rotate(500);
		tMotor.toggle();
		mMotor.rotate(500*3);
		bMotor.rotate(-70*3);
		tMotor.toggle();
		bMotor.rotateToDefaultPos();
		mMotor.rotateToDefaultPos();

		//		Behavior's priority is determined by it's position in
//		behaviorArray. First index being the lowest priority
//		and last being the highest.

//		Behavior b1 = new BUser();
//		Behavior b2 = new BDemo();
//		Behavior[] behaviorArray = {b1, b2};
//		Arbitrator arbi = new Arbitrator(behaviorArray);
	}
}