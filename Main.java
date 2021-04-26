import java.util.*;

public class Main {
    public static List<Movie> movieList;

    public static void main(String[] args) {

        //fetch movie data from database
        movieList = DataBaseClass.getMovieDataFromDatabase();
        //create view for write onto the console.
        MovieView movieView = new MovieView();
        MovieController movieController = new MovieController(movieView);
        movieController.updateView();
        int index = 0;
        for (Movie movie : movieList) {
            if (movie.getMovieType().equals(MovieType.BOLLYWOOD)) {
                movieController.setMovie(movie);
                movieController.setAverageCost(MovieType.HOLLYWOOD);
                movieList.set(index, movieController.updatedMovie());
            }
            index++;
        }
        movieController.updateView(MovieType.BOLLYWOOD);
    }
}
