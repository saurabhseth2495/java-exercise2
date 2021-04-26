
import java.util.List;

public class ServiceClassImplementation implements ServiceProvided {
    @Override
    public List<Movie> getAllMovies() {
        return new MovieDao().getAllMovieList();
    }

    @Override
    public List<Movie> getAllMovieSpecificType(MovieType movieType) {
        return new MovieDao().getSpecificMovieList(movieType);
    }
}
