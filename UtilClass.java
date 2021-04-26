import java.util.Calendar;
import java.util.Date;

public class UtilClass {

    public static Date getReleaseDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        if (year != 0) {
            calendar.add(Calendar.YEAR, year);
        }
        if (month != 0) {
            calendar.add(Calendar.MONTH, month);
        }
        if (day != 0) {
            calendar.add(Calendar.DAY_OF_MONTH, day);
        }

        Date date = calendar.getTime();
        return date;
    }

    public static String getYear(int y) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, y);
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        return year;
    }

    public static Movie movieRetriveFromDatabase(int movieId, String name, String year, String language, String genre, Date releaseDate, MovieType movieType, FreeFoodDish freeFoodDish, float averageCost, boolean isBlockBuster) {
        Movie movie = new Movie();
        movie.setMovieId(movieId);
        movie.setMovieType(movieType);
        movie.setGenre(genre);
        movie.setName(name);
        movie.setAverageCost(averageCost);
        movie.setFreeFoodDish(freeFoodDish);
        movie.setLanguage(language);
        movie.setYear(year);
        movie.setReleaseDate(releaseDate);
        movie.setBlockBuster(isBlockBuster);
        return movie;
    }
}
