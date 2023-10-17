package pkg;

public class Calculations {
    // Constants of conversion
    private final static double GRAVITY = 9.80665f;
    private final static double LBS_TO_KG = 0.4535924f;
    private final static double IN_TO_CM = 2.54f;
    
    public static double convertToCm(double inches) {
		return (inches * IN_TO_CM);
	}

    public static double convertToKg(double lbs) {
		return (lbs * LBS_TO_KG);
	}

	/**
	 * Get the moment of the specified weight and length. Used for further calculations of energy expended.
	 * @param weight A double specifying the weight in kilograms.
	 * @param length A double specifying the length of the arm in centimeters.
	 * @return A double representing the moment of the weight and length in Joules/Newton meters.
	 */
	public static double getMoment(double weight, double length) {
		// Going to need to add in the SINE of the angle eventually...
		return (weight * GRAVITY * length * 100);
	}

	
}
