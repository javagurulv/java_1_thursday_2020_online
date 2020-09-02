package student_aleksey_kodin.lesson15.level_6;

class Movie {

    private final String title;
    private final MovieCategory priceCode;

    public Movie(String title, MovieCategory movieCategory) {
        this.title = title;
        this.priceCode = movieCategory;
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getPriceCode() {
        return priceCode;
    }
}