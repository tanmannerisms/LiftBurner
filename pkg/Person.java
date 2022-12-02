package pkg;

public class Person {
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

	Person() {
		
	}