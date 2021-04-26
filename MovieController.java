import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieController {
    private MovieView movieView;
    private Movie movie;

    public MovieController() {

    }

    public MovieController(MovieView movieView) {
        this.movieView = movieView;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public boolean isBlockBuster() {
        return movie.isBlockBuster();
    }

    public void setBlockBuster() {
        movie.setBlockBuster(movie.isBlockBuster());
    }

    public int getMovieId() {
        return movie.getMovieId();
    }

    public void setMovieId(int movieId) {
        movie.setMovieId(movieId);
    }

    public String getName() {
        return movie.getName();
    }

    public void setName(String name) {
        movie.setName(name);
    }

    public String getYear() {
        return movie.getYear();
    }

    public void setYear(String year) {
        movie.setYear(year);
    }

    public String getLanguage() {
        return movie.getLanguage();
    }

    public void setLanguage(String language) {
        movie.setLanguage(language);
    }

    public String getGenre() {
        return movie.getGenre();
    }

    public void setGenre(String genre) {
        movie.setGenre(genre);
    }

    public Date getReleaseDate() {
        return movie.getReleaseDate();
    }

    public void setReleaseDate(Date releaseDate) {
        movie.setReleaseDate(releaseDate);
    }

    public MovieType getMovieType() {
        return movie.getMovieType();
    }

    public void setMovieType(MovieType movieType) {
        movie.setMovieType(movieType);
    }

    public FreeFoodDish getFreeFoodDish() {
        return movie.getFreeFoodDish();
    }

    public void setFreeFoodDish(MovieType movieType) {
        movie.setFreeFoodDish(getFreeDishOfMovieType(movieType));
    }

    public float getAverageCost() {
        return movie.getAverageCost();
    }

    public void setAverageCost(MovieType movieType) {
        movie.setAverageCost(getAverageCostOfMovieType(movieType));
    }

    public Movie updatedMovie() {
        return movie;
    }

    public String getString(Movie movie1) {
        return movie1.toString();
    }

    private Float getAverageCostOfMovieType(MovieType movieType) {
        switch (movieType) {
            case BOLLYWOOD:
                return 100.00f;
            case HOLLYWOOD:
                return 1000.00f;
            case TOLLYWOOD:
                return 50.00f;
        }
        return 0.0f;
    }

    private FreeFoodDish getFreeDishOfMovieType(MovieType movieType) {
        switch (movieType) {
            case BOLLYWOOD:
                return FreeFoodDish.DALMAKHNI;
            case HOLLYWOOD:
                return FreeFoodDish.PAPERSTICK;
            case TOLLYWOOD:
                return FreeFoodDish.DOSA;
        }
        return FreeFoodDish.DALMAKHNI;
    }

    public void updateView() {
        ServiceProvided services = new ServiceClassImplementation();
        List<Movie> movieList = services.getAllMovies();
        movieView.showAll(movieList);
    }

    public void updateView(MovieType movieType) {
        ServiceProvided services = new ServiceClassImplementation();
        List<Movie> movieList = services.getAllMovieSpecificType(movieType);
        movieView.showAll(movieList);
    }

}
