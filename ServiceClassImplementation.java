
import java.util.List;

public class ServiceClassImplementation implements Services {
    @Override
    public List<Movie> getAllMovies() {
        return new MovieDaoImplement().getAllMovieList();
    }

    @Override
    public List<Movie> getAllMovieSpecificType(MovieType movieType) {
        return new MovieDaoImplement().getSpecificMovieList(movieType);
    }
}
