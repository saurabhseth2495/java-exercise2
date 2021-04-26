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

    public boolean isBlockBuster() {
        Random random = new Random();
        if (this.firstTime) {
            isBlockBuster = random.nextBoolean();
            this.firstTime = false;
        }
        return isBlockBuster;
    }

    public void setBlockBuster(boolean blockBuster) {
        this.isBlockBuster = blockBuster;
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

    public Float getAverageCostOfMovieType(MovieType movieType) {
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

    public FreeFoodDish getFreeDishOfMovieType(MovieType movieType) {
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

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", movieType=" + movieType +
                ", freeFoodDish=" + freeFoodDish +
                ", averageCost=" + averageCost +
                ", isBlockBuster=" + isBlockBuster +
                '}';
    }
}
