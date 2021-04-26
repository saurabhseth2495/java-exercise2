import java.util.*;

public class Main {

    private String year;
    private Date releaseDate;
    public static List<Movie> movieList;

    public static void main(String[] args) {
        new Main().insertMovieData();
        List<Movie> tempList = new ServiceClassImplementation().getAllMovies();
        System.out.println("movie Id :- " + tempList.get(0).getMovieId());
        System.out.println("movie name :- " + tempList.get(0).getName());
        System.out.println("movie type :- " + tempList.get(0).getMovieType());
        System.out.println("movie genre :- " + tempList.get(0).getGenre());
        System.out.println("movie year :- " + tempList.get(0).getYear());
        System.out.println("movie release date :- " + tempList.get(0).getReleaseDate());
        System.out.println("movie lang :- " + tempList.get(0).getLanguage());
        System.out.println("average cost :- " + tempList.get(0).getAverageCost());
        System.out.println("free dish :- " + tempList.get(0).getFreeFoodDish());
        System.out.println("movie is blockbuster :- " + tempList.get(0).isBlockBuster());
      /*  System.out.println("movie is blockbuster :- " + tempList.get(1).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(2).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(3).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(0).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(1).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(2).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(3).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(0).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(1).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(2).isBlockBuster());
        System.out.println("movie is blockbuster :- " + tempList.get(3).isBlockBuster());*/
    }

    private Float getAverageCost(MovieType movieType) {
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

    private FreeFoodDish getFreeDish(MovieType movieType) {
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

    public void insertMovieData() {
        movieList = new ArrayList<>();
        year = getYear(-4);
        releaseDate = getReleaseDate(-4, 0, 0);
        Random random = new Random();
        Movie movie1 = new Movie(123, "Bahubali", year, "Telgu", "Action", releaseDate, MovieType.TOLLYWOOD, FreeFoodDish.DOSA, getAverageCost(MovieType.TOLLYWOOD));
        movie1.setBlockBuster(movie1.isBlockBuster());
        year = getYear(-2);
        releaseDate = getReleaseDate(-2, 0, 0);
        Movie movie2 = new Movie(122, "Kites", year, "Hindi", "Adventure", releaseDate, MovieType.BOLLYWOOD, FreeFoodDish.DALMAKHNI, getAverageCost(MovieType.BOLLYWOOD));
        movie2.setBlockBuster(movie2.isBlockBuster());
        year = getYear(-3);
        releaseDate = getReleaseDate(-3, 0, 0);
        Movie movie3 = new Movie(125, "Gravity", year, "English", "ScienceFiction", releaseDate, MovieType.HOLLYWOOD, FreeFoodDish.PAPERSTICK, getAverageCost(MovieType.HOLLYWOOD));
        movie3.setBlockBuster(movie3.isBlockBuster());
        year = getYear(-7);
        releaseDate = getReleaseDate(-7, 0, 0);
        Movie movie4 = new Movie(126, "Avenger", year, "English", "Action", releaseDate, MovieType.HOLLYWOOD, getFreeDish(MovieType.HOLLYWOOD), getAverageCost(MovieType.HOLLYWOOD));
        movie4.setBlockBuster(movie4.isBlockBuster());
        year = getYear(-9);
        releaseDate = getReleaseDate(-9, 0, 0);
        Movie movie5 = new Movie(121, "Dus", year, "Hindi", "Action", releaseDate, MovieType.BOLLYWOOD, getFreeDish(MovieType.BOLLYWOOD), getAverageCost(MovieType.BOLLYWOOD));
        movie5.setBlockBuster(movie5.isBlockBuster());
        year = getYear(-1);
        releaseDate = getReleaseDate(-1, 0, 03);
        Movie movie6 = new Movie(129, "1920", year, "Hindi", "Horror", releaseDate, MovieType.BOLLYWOOD, getFreeDish(MovieType.BOLLYWOOD), getAverageCost(MovieType.BOLLYWOOD));
        movie6.setBlockBuster(movie6.isBlockBuster());
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
    }

    private Date getReleaseDate(int year, int month, int day) {
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

    private String getYear(int y) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, y);
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        return year;
    }
}
