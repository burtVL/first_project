package homework_12.task4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieServiceTest extends BaseMovieServiceTest {
    private static final int MIN_RATING = 1;
    private static final int MAX_RATING = 10;
    private static final int VALID_RATING_1 = 5;
    private static final int VALID_RATING_2 = 8;
    private static final double INVALID_RATING = 0.5;

    @Test
    void testAddRatingAndAverage() {
        addRatings(inception, VALID_RATING_1, VALID_RATING_2);

        double expectedAverage = (VALID_RATING_1 + VALID_RATING_2)/2.0;
        assertEquals(expectedAverage, movieService.getAverageRating(inception));
    }


    @Test
    void testBoundaryRatings() {
        addRatings(inception, MIN_RATING, MAX_RATING);
        assertEquals((MIN_RATING + MAX_RATING)/2.0, movieService.getAverageRating(inception));
    }

    @Test
    void testSortingByRating() {
        addRatings(movie1, VALID_RATING_1);
        addRatings(movie2, VALID_RATING_2);

        List<Movie> sortedMovies = movieService.getMovieSortedRating();
        assertEquals(movie2, sortedMovies.get(0));
        assertEquals(movie1, sortedMovies.get(1));
    }


}
