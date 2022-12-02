import java.lang.Math;
import pkg.Person;


public class Main {

	public static float convertToCm(float inches) {
		return (inches * 2.54f);
	}	

	public static float convertToKg(float lbs) {
		return (lbs * 0.4535924f);
	}

	public static float getMoment(float length, float distance) {
		return (length * distance);
	}

	// Calculate work done for moving mass certain distance.
	// Create a class for Person; this is already getting out of hand without it.
	// Create a class for doing all these calculations. Do conversions
	// need to be under the Person or Calculations class??

	

	public static void main(String[] args) {
		Person Tanner = new Person()

		final float CONST_GRAVITY = 9.80665f;
		
		//Body Measurements:
		final float HEIGHT = convertToCm(74);
		// These values are taken from crude measurements
		// between my joints. All measurements are in inches.
		final float HUMERUS_LENGTH = convertToCm(11.75f);
		final float ULNA_LENGTH = convertToCm(11.25f);
		final float FEMUR_LENGTH = convertToCm(19);
		final float TIBIA_LENGTH = convertToCm(18);
		// This one is from hip joint to shoulder joint.
		final float TORSO_LENGTH = convertToCm(22);

		// Combination variables:
		final float ARM_LENGTH = ULNA_LENGTH + HUMERUS_LENGTH;
		final float LEG_LENGTH = FEMUR_LENGTH + TIBIA_LENGTH;
		final float OVRHEAD_LENGTH = LEG_LENGTH + TORSO_LENGTH + ARM_LENGTH;

		float weight = convertToKg(185);

	


		System.out.println();


	}

}