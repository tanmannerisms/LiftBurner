package pkg;

import pkg.Calculations;

public class Person {
	//Body Measurements:
	double HEIGHT;
	double WEIGHT;
	double HUMERUS_LENGTH;
	double ULNA_LENGTH;
	double FEMUR_LENGTH;
	double TIBIA_LENGTH;
	double TORSO_LENGTH;
	double ARM_LENGTH;
	double LEG_LENGTH;
	double OVRHEAD_LENGTH;


	public void Person(double height, double weight, double humerus, double ulna, double femur, double tibia, double torso) {
		HEIGHT = Calculations.convertToCm(height);
		double WEIGHT= Calculations.convertToKg(weight);

		HUMERUS_LENGTH = Calculations.convertToCm(humerus);
		ULNA_LENGTH = Calculations.convertToCm(ulna);
		FEMUR_LENGTH = Calculations.convertToCm(femur);
		TIBIA_LENGTH = Calculations.convertToCm(tibia);
		TORSO_LENGTH = Calculations.convertToCm(torso);
		LEG_LENGTH = FEMUR_LENGTH + TIBIA_LENGTH;
		ARM_LENGTH = ULNA_LENGTH + HUMERUS_LENGTH;
		OVRHEAD_LENGTH = LEG_LENGTH + ARM_LENGTH + TORSO_LENGTH;
	}
		
}