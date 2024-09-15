package testing;

import movie.MovieItem;
import movie.movie;

public class movieTest extends MovieItem{
    public movieTest(String title, String author) {
        super(title, author);
    }
    
        public static void main(String[] args) {
            movie movie=new movie();

            MovieItem item1=new movieTest("Rezan","kobel");
            MovieItem item2=new movieTest("Avatar","sola");

            movie.addmovieItem(item1);
            movie.addmovieItem(item2);

            movie.printmovieDetails();
            
        }

    }







