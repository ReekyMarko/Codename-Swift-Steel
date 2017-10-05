package robot;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

/**
 * This is the motor class for the middle motor of the robot.
 * @author Team 12: Ville Kautonen, Jerry Hällfors, Marko Korhonen
 *
 */
public class MiddleMotor {
	private RegulatedMotor motor = new EV3LargeRegulatedMotor(MotorPort.B);
	private int curRotation;
	private static int maxRotation;

	public MiddleMotor(){
		maxRotation = 90*3;
		curRotation = 0;
	}
	/**
	 * Rotates the motor for a specified amount. Positive angle is away from the default
	 * position, negative angle is towards the default position.
	 * @param angle the angle to be rotated
	 */
	public void rotate(int angle){
		if(angle + curRotation > maxRotation){
			angle = maxRotation - curRotation;
		}
		motor.rotate(-angle);
		curRotation += angle;
	}
	/**
	 * Rotates the motor back to it's default position, regardless of current position.
	 */
	public void rotateToDefaultPos(){
		rotate(-curRotation);
		curRotation = 0;
	}
}