import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataBaseClass {
    private static String year;
    private static Date releaseDate;

    public static List<Movie> getMovieDataFromDatabase() {
        year = UtilClass.getYear(-4);
        releaseDate = UtilClass.getReleaseDate(-4, 0, 0);
        Movie movie1 = UtilClass.movieRetriveFromDatabase(123, "Bahubali", year, "Telgu", "Action", releaseDate, MovieType.TOLLYWOOD, FreeFoodDish.DOSA, 50.0f, true);
        year = UtilClass.getYear(-3);
        releaseDate = UtilClass.getReleaseDate(-2, 0, 0);
        Movie movie2 = UtilClass.movieRetriveFromDatabase(122, "Kites", year, "Hindi", "Adventure", releaseDate, MovieType.BOLLYWOOD, FreeFoodDish.DALMAKHNI, 500.0f, false);
        year = UtilClass.getYear(-2);
        releaseDate = UtilClass.getReleaseDate(-3, 0, 0);
        Movie movie3 = UtilClass.movieRetriveFromDatabase(124, "Gravity", year, "English", "Science Fiction", releaseDate, MovieType.HOLLYWOOD, FreeFoodDish.PAPERSTICK, 1000.0f, true);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        return movieList;
    }
}
