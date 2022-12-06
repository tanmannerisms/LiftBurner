package pkg;

import pkg.Calculations;

public class Person {
	private String name;

	// Broad Measurements:
	private double height, weight;
	private double humerusLen, ulnaLen, femurLen, tibiaLen, torsoLen;
	// Compound Measurements
	private double armLen, legLen, ovrHeadLen;

	public Person() {
	}

	public Person(String personName, double hgt, double wgt, double humerus, double ulna, double femur, double tibia, double torso) {
		name = personName;

		height = Calculations.convertToCm(hgt);
		weight= Calculations.convertToKg(wgt);

		humerusLen = Calculations.convertToCm(humerus);
		ulnaLen = Calculations.convertToCm(ulna);
		femurLen = Calculations.convertToCm(femur);
		tibiaLen = Calculations.convertToCm(tibia);
		torsoLen = Calculations.convertToCm(torso);
		legLen = femurLen + tibiaLen;
		armLen = ulnaLen + humerusLen;
		ovrHeadLen = legLen + armLen + torsoLen;
	}

	public void PrintValues() {
		System.out.println(this.name + "'s Profile:");
		System.out.println("Arm lenght: " + this.armLen);
		System.out.println("Leg Length" + this.legLen);
		System.out.println("Overhead reach length: " + this.ovrHeadLen);
	}
		
}