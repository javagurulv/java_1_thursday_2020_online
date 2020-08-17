package student_igors_mihejevs.lesson_8.lessoncode;

public class ElectricCar extends Car {

	private int bateryCapacy;

	public ElectricCar(String model, int bateryCapacy) {
		super(model);
		this.bateryCapacy = bateryCapacy;
	}

	@Override
	public void start() {
		if (this.bateryCapacy > 0) {
			this.bateryCapacy--;
			System.out.println("Accumulator switched ON!");
		} else {
			System.out.println("Accumulator is empty!");
		}
	}

	@Override
	public void stop() {
		System.out.println("Accumulator switched OFF!");
	}

}
