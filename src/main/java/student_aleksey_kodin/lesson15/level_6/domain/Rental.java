package student_aleksey_kodin.lesson15.level_6.domain;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Rental {

	private final Movie movie;
	private final int daysRented;

	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
}