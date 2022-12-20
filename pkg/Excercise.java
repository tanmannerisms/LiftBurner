package pkg;

public class Excercise {

	protected int reps;

	
	public enum ROUTINE {
		PUSH,
		PULL,
		LEGS
	}

	public enum TYPE {
		SINGLE,
		DOUBLE
	}

}	


abstract class BenchPress extends Excercise {
	BenchPress.ROUTINE PUSH;
	BenchPress.TYPE DOUBLE;


	public void setReps(int reps) {
		this.reps = reps;
	}
}