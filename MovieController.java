import java.util.List;

public class MovieController {

    public List<Movie> getMovieList() {
        Services services = new ServiceClassImplementation();
        return services.getAllMovies();
    }

    public List<Movie> getMovieList(MovieType movieType) {
        Services services = new ServiceClassImplementation();
        return services.getAllMovieSpecificType(movieType);
    }

}
