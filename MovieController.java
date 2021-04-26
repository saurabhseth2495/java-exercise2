import java.util.List;

public class MovieController {

    public List<Movie> getMovieList() {
        ServiceProvided services = new ServiceClassImplementation();
        return services.getAllMovies();
    }

    public List<Movie> getMovieList(MovieType movieType) {
        ServiceProvided services = new ServiceClassImplementation();
        return services.getAllMovieSpecificType(movieType);
    }

}
