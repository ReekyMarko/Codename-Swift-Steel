package robot;

/**
 * A high level class which contains methods to rotate all motors to a specific place on the working surface
 * @author Team 12: Ville Kautonen, Jerry Hällfors, Marko Korhonen
 *
 */
public class Navigator {
	BottomMotor bMotor;
	MiddleMotor mMotor;
	TopMotor tMotor;

	private int rideHeight = 70*3;
	private int t1Height = rideHeight - 37*3;
	private int t2Height = rideHeight - 27*3;
	private int tA = 103*3;
	private int tB = 60*3;
	private int cA = 260*3;
	private int cB = 210*3;
	private int cC = 160*3;

	public Navigator(BottomMotor bMotor, MiddleMotor mMotor, TopMotor tMotor){
		this.bMotor = bMotor;
		this.mMotor = mMotor;
		this.tMotor = tMotor;
	}

	public void tireA1(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((tA)-bMotor.getCurRotation());
		mMotor.rotate(-t1Height);
	}

	public void tireB1(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((tB)-bMotor.getCurRotation());
		mMotor.rotate(-t1Height);
	}

	public void tireA2(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((tA)-bMotor.getCurRotation());
		mMotor.rotate(-t2Height);
	}

	public void tireB2(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((tB)-bMotor.getCurRotation());
		mMotor.rotate(-t2Height);
	}

	public void tireA3(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((tA)-bMotor.getCurRotation());
		mMotor.rotate(-rideHeight);
	}

	public void tireB3(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((tB)-bMotor.getCurRotation());
		mMotor.rotate(-rideHeight);
	}

	public void cupA(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((cA)-bMotor.getCurRotation());
	}

	public void cupB(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((cB)-bMotor.getCurRotation());
	}

	public void cupC(){
		mMotor.rotate((rideHeight)-mMotor.getCurRotation());
		bMotor.rotate((cC)-bMotor.getCurRotation());
	}

	public void grabToggle(){
		tMotor.toggle();
	}

	public void rotateToDefaultPos(){
		if(mMotor.getCurRotation() != rideHeight){
			mMotor.rotate(rideHeight);
		}
		bMotor.rotateToDefaultPos();
		mMotor.rotateToDefaultPos();
	}

	public void lift() {
		if (mMotor.getCurRotation() != rideHeight) {
			mMotor.rotate(rideHeight);
		}
	}
}
