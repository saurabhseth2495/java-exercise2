

import java.util.ArrayList;
import java.util.List;

public class ServiceClassImplementation implements ServiceProvided {
    @Override
    public List<Movie> getAllMovies() {
        setDataForBlockBuster(Main.movieList);
        return Main.movieList;
    }

    @Override
    public List<Movie> getAllMovieSpecificType(MovieType movieType) {
        List<Movie> tempMovie = new ArrayList<>();
        for (Movie movie : Main.movieList)
            if (movie.getMovieType() == movieType) {
                tempMovie.add(movie);
            }
        setDataForBlockBuster(tempMovie);
        return tempMovie;
    }

    private void setDataForBlockBuster(List<Movie> movieList) {
        for (Movie movie : movieList) {
            movie.setBlockBuster(movie.isBlockBuster());
        }
    }
}
