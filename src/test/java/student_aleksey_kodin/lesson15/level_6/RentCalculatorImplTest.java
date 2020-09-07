package student_aleksey_kodin.lesson15.level_6;

import org.junit.Test;
import student_aleksey_kodin.lesson15.level_6.domain.Customer;
import student_aleksey_kodin.lesson15.level_6.domain.Movie;
import student_aleksey_kodin.lesson15.level_6.domain.MovieCategory;
import student_aleksey_kodin.lesson15.level_6.domain.Rental;
import student_aleksey_kodin.lesson15.level_6.logic.Report;
import teacher.codereview.CodeReview;

import static org.junit.Assert.*;

@CodeReview(approved = true)
public class RentCalculatorImplTest {
    Movie movie = new Movie("Movie", MovieCategory.REGULAR);
    Movie movie1 = new Movie("Movie1", MovieCategory.NEW_RELEASE);
    Movie movie2 = new Movie("Movie2", MovieCategory.CHILDREN);
    Rental rental1 = new Rental(movie, 1);
    Customer customer1 = new Customer("User1");
    Report report = new Report();
    RentCalculatorImpl rentCalculator = new RentCalculatorImpl(report);

    @Test
    public void oneRegularMovieLessTwoDays() {
        customer1.addRental(rental1);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 2.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 1);
    }

    @Test
    public void twoRegularMovieLessTwoDays() {
        Rental rental2 = new Rental(movie, 1);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 4.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 2);
    }

    @Test
    public void oneRegularMovieMoreTwoDays() {
        Rental rental1 = new Rental(movie, 3);
        customer1.addRental(rental1);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 3.5, 0);
        assertEquals(result.getFrequentRenterPoints(), 1);
    }

    @Test
    public void twoRegularMovieMoreTwoDays() {
        Rental rental1 = new Rental(movie, 3);
        Rental rental2 = new Rental(movie, 3);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 7.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 2);
    }

    @Test
    public void oneNewReleaseMovieLessTwoDays() {
        Rental rental1 = new Rental(movie1, 1);
        customer1.addRental(rental1);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 3.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 1);
    }

    @Test
    public void twoNewReleaseMovieLessTwoDays() {
        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie1, 1);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 6.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 2);
    }

    @Test
    public void oneNewReleaseMovieMoreTwoDays() {
        Rental rental1 = new Rental(movie1, 10);
        customer1.addRental(rental1);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 30.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 2);
    }

    @Test
    public void twoNewReleaseMovieMoreTwoDays() {
        Rental rental1 = new Rental(movie1, 10);
        Rental rental2 = new Rental(movie1, 5);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 45.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 4);
    }

    @Test
    public void oneChildrenMovieLessTwoDays() {
        Rental rental1 = new Rental(movie2, 1);
        customer1.addRental(rental1);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 1.5, 0);
        assertEquals(result.getFrequentRenterPoints(), 1);
    }

    @Test
    public void twoChildrenMovieLessTwoDays() {
        Rental rental1 = new Rental(movie2, 1);
        Rental rental2 = new Rental(movie2, 1);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 3.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 2);
    }

    @Test
    public void oneChildrenMovieMoreTwoDays() {
        Rental rental1 = new Rental(movie2, 5);
        customer1.addRental(rental1);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 4.5, 0);
        assertEquals(result.getFrequentRenterPoints(), 1);
    }

    @Test
    public void twoChildrenMovieMoreTwoDays() {
        Rental rental1 = new Rental(movie2, 5);
        Rental rental2 = new Rental(movie2, 10);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 16.5, 0);
        assertEquals(result.getFrequentRenterPoints(), 2);
    }

    @Test
    public void allMoviesLessTwoDays() {
        Rental rental1 = new Rental(movie, 1);
        Rental rental2 = new Rental(movie1, 1);
        Rental rental3 = new Rental(movie2, 1);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        customer1.addRental(rental3);
        Customer result = rentCalculator.calculate(customer1);

        assertEquals(result.getTotalAmount(), 6.5, 0);
        assertEquals(result.getFrequentRenterPoints(), 3);
    }

    @Test
    public void allMoviesMoreTwoDays() {
        Rental rental1 = new Rental(movie, 3);
        Rental rental2 = new Rental(movie1, 10);
        Rental rental3 = new Rental(movie2, 5);
        customer1.addRental(rental1);
        customer1.addRental(rental2);
        customer1.addRental(rental3);
        Customer result = rentCalculator.calculate(customer1);

        report.showReport();

        assertEquals(result.getTotalAmount(), 38.0, 0);
        assertEquals(result.getFrequentRenterPoints(), 4);
    }

}