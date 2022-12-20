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

	public static double getWork(double force, double distance) {
		/* Work = Force * Distance when the force is parallel to the displacement of the object being moved.
		 Work = Force * Distance * cos(theta) when the force is not parallel, where theta is the angle between
		 the direction of motion of the object and the direction of force acting upon it.
		 The definition of work require there to be some displacement of the object that a force is acting
		 upon. In this scenario, I should be taking the suspension of a weight into consideration and the
		 the amount of 'work' that is required to be uphold said weight without a shift in the position of it.
		 This should simply be a measure of the length in time that the weight is not moving, multiplied by
		 the weight of it. This should give an idea of the amount of work that is required.
		*/
		return (force * distance);
	}
}
