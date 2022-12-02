package pkg;

public class Calculations {
    // Constants of conversion
    private final static float GRAVITY = 9.80665f;
    private final static float LBS_TO_KG = 0.4535924f;
    private final static float IN_TO_CM = 2.54f;
    
    public static float convertToCm(float inches) {
		return (inches * IN_TO_CM);
	}

    public static float convertToKg(float lbs) {
		return (lbs * LBS_TO_KG);
	}

	public static float getMoment(float length, float distance) {
		return (length * distance);
	}

}
