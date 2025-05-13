package homework_12.task4;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MovieService<T extends Number> {
    private final Map<Movie, List<Rating<T>>> movieRatings = new ConcurrentHashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        double value = rating.getValue().doubleValue();
        if (value < 1 || value > 10) {
            throw new IllegalArgumentException("Оценка должна быть от 1 до 10");
        }
        movieRatings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public double getAverageRating(Movie movie) {
        List<Rating<T>> ratings = movieRatings.getOrDefault(movie, Collections.emptyList());
        return ratings.stream()
                .mapToDouble(r ->r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> getMovieSortedRating() {
        List<Movie> movies = new ArrayList<>(movieRatings.keySet());
        movies.sort(Comparator.comparingDouble(this::getAverageRating).reversed());
        return movies;
    }
}
