package student_aleksey_kodin.lesson8.levelx.supertask2;

class Argument extends MathOperation {

	private final double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
