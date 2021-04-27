import java.util.ArrayList;
import java.util.List;

public class MovieDao {
    public List<Movie> getAllMovieList() {
        return new DataBaseClass().getMovieDataFromDatabase();
    }

    public List<Movie> getSpecificMovieList(MovieType movieType) {
        List<Movie> tempList = new ArrayList<>();
        for (Movie movie : new DataBaseClass().getMovieDataFromDatabase()) {
            if (movie.getMovieType().equals(movieType)) {
                tempList.add(movie);
            }
        }
        return tempList;
    }
}
