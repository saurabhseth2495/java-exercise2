import java.util.ArrayList;
import java.util.List;

public class ServiceClassImplementation implements ServiceProvided {
    @Override
    public List<Movie> getAllMovies() {
        DataBaseClass.getMovieDataFromDatabase();
        return Main.movieList;
    }

    @Override
    public List<Movie> getAllMovieSpecificType(MovieType movieType) {
        DataBaseClass.getMovieDataFromDatabase();
        List<Movie> tempMovie = new ArrayList<>();
        for (Movie movie : Main.movieList)
            if (movie.getMovieType() == movieType) {
                tempMovie.add(movie);
            }
        return tempMovie;
    }
}
