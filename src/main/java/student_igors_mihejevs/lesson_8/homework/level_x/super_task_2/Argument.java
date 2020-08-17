package student_igors_mihejevs.lesson_8.homework.level_x.super_task_2;

class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
