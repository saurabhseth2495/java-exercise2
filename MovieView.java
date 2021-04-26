import java.util.List;

public class MovieView {
    public void showMovieList() {
        List<Movie> temp = new MovieController().getMovieList();
        String str = null;
        System.out.println("start.......");
        for (Movie movie : temp) {
            System.out.println("-----------");
            str = movie.toString();
            System.out.println(str);
            System.out.println("-----------");
        }
        System.out.println("end.......");
    }

    public void showSpecificMovieList(MovieType movieType) {
        List<Movie> temp = new MovieController().getMovieList(movieType);
        String str = null;
        System.out.println("start.......");
        for (Movie movie : temp) {
            System.out.println("-----------");
            str = movie.toString();
            System.out.println(str);
            System.out.println("-----------");
        }
        System.out.println("end.......");
    }

}
