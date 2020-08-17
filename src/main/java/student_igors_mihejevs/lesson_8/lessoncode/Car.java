package student_igors_mihejevs.lesson_8.lessoncode;

public abstract class Car extends Object {

	private String model;

	public Car(String model) {
		super();
		this.model = model;
	}

	public abstract void start();

	public abstract void stop();

}
