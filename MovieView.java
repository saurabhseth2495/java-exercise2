import java.util.List;

public class MovieView {
    public void showAll(List<Movie> movieList) {
        String str = null;
        for (Movie movie : movieList) {
            System.out.println("-----------");
            str = new MovieController().getString(movie);
            System.out.println(str);
            System.out.println("-----------");
        }
    }

}
