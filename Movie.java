import java.util.Date;
import java.util.Random;

enum MovieType {
    TOLLYWOOD,
    BOLLYWOOD,
    HOLLYWOOD
}

enum FreeFoodDish {
    DOSA,
    DALMAKHNI,
    PAPERSTICK
}

public class Movie {
    private int movieId;
    private String name;
    private String year;
    private String language;
    private String genre;
    private Date releaseDate;
    private MovieType movieType;
    private FreeFoodDish freeFoodDish;
    private float averageCost;
    private boolean isBlockBuster;
    private boolean firstTime = true;

    public Movie(int movieId, String name, String year, String language, String genre, Date releaseDate, MovieType movieType, FreeFoodDish freeFoodDish, float averageCost) {
        this.movieId = movieId;
        this.name = name;
        this.year = year;
        this.language = language;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.movieType = movieType;
        this.freeFoodDish = freeFoodDish;
        this.averageCost = averageCost;
    }

    public boolean isBlockBuster() {
        Random random = new Random();
        if (firstTime) {
            isBlockBuster = random.nextBoolean();
            firstTime = false;
        }
        return isBlockBuster;
    }

    public void setBlockBuster(boolean blockBuster) {
        isBlockBuster = blockBuster;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public FreeFoodDish getFreeFoodDish() {
        return freeFoodDish;
    }

    public void setFreeFoodDish(FreeFoodDish freeFoodDish) {
        this.freeFoodDish = freeFoodDish;
    }

    public float getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(float averageCost) {
        this.averageCost = averageCost;
    }
}
