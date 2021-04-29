import java.util.List;

public interface MovieDao {
    //use query for get data from database.
    List<Movie> getAllMovieList();

    List<Movie> getSpecificMovieList(MovieType movieType);
}
