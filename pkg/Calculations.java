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

	public static double getMoment(double length, double distance) {
		return (length * distance);
	}

	
}
