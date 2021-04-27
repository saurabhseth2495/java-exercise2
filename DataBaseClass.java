import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBaseClass {
    private String year;
    private Date releaseDate;

    public List<Movie> getMovieDataFromDatabase() {
        year = UtilClass.getYear(-4);
        releaseDate = UtilClass.getReleaseDate(-4, 0, 0);
        Movie movie1 = new Movie(123, "Bahubali", year, "Telgu", "Action", releaseDate, MovieType.TOLLYWOOD);
        movie1.setBlockBuster(movie1.isBlockBuster());
        movie1.setAverageCost(movie1.getAverageCostOfMovieType(MovieType.TOLLYWOOD));
        movie1.setFreeFoodDish(movie1.getFreeDishOfMovieType(MovieType.TOLLYWOOD));
        year = UtilClass.getYear(-3);
        releaseDate = UtilClass.getReleaseDate(-2, 0, 0);
        Movie movie2 = new Movie(122, "Kites", year, "Hindi", "Adventure", releaseDate, MovieType.BOLLYWOOD);
        movie2.setBlockBuster(movie2.isBlockBuster());
        movie2.setAverageCost(movie2.getAverageCostOfMovieType(MovieType.BOLLYWOOD));
        movie2.setFreeFoodDish(movie2.getFreeDishOfMovieType(MovieType.BOLLYWOOD));
        year = UtilClass.getYear(-2);
        releaseDate = UtilClass.getReleaseDate(-3, 0, 0);
        Movie movie3 = new Movie(124, "Gravity", year, "English", "Science Fiction", releaseDate, MovieType.HOLLYWOOD);
        movie3.setBlockBuster(movie3.isBlockBuster());
        movie3.setAverageCost(movie3.getAverageCostOfMovieType(MovieType.BOLLYWOOD));
        movie3.setFreeFoodDish(movie3.getFreeDishOfMovieType(MovieType.BOLLYWOOD));
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        return movieList;
    }
}
