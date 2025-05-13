package homework_12.task4;

import org.junit.jupiter.api.BeforeEach;

public class BaseMovieServiceTest {
    protected MovieService<Integer> movieService;
    protected Movie inception;
    protected Movie interstellar;
    protected Movie movie1;
    protected Movie movie2;

    @BeforeEach
    void setUp() {
        movieService = new MovieService<>();
        inception = new Movie("Inception", 2010, "Nolan");
        interstellar = new Movie("Interstellar", 2014, "Nolan");
        movie1 = new Movie("Movie1", 2000, "Director1");
        movie2 = new Movie("Movie2", 2001, "Director2");
    }

    protected void addRatings(Movie movie, Integer... ratings) {
        for (Integer rating : ratings) {
            movieService.addRating(movie, new Rating<>(rating));
        }

    }

}
