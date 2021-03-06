package robot;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

/**
 * The motor class for the middle motor of the robot.
 * @author Team 12: Ville Kautonen, Jerry Hällfors, Marko Korhonen
 *
 */
public class MiddleMotor {
	/**
	 * The LeJOS motor used in this class
	 */
	private RegulatedMotor motor = new EV3LargeRegulatedMotor(MotorPort.B);

	/**
	 * The current rotation of the motor is always saved here
	 */
	private int curRotation;

	/**
	 *
	 * @return the current rotation of the motor
	 */
	public int getCurRotation() {
		return curRotation;
	}
	/**
	 * The maximum rotation the motor can handle
	 */
	private static int maxRotation;

	public MiddleMotor(){
		maxRotation = 90*3;
		curRotation = 0;
		motor.setSpeed(150);
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

	public void forward() {
		motor.forward();
	}

	public void stop() {
		motor.stop();
	}

	public void backward() {
		motor.backward();
	}

	public int getRotationSpeed() {
		return motor.getRotationSpeed();
	}

	public void setSpeed(int speed) {
		motor.setSpeed(speed);
	}
}