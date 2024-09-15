package movie;
import java.util.ArrayList;
import java.util.List;


public class movie {
    private List<MovieItem> movieItems;

    public movie(){
        this.movieItems=new ArrayList<>();

    }

public void addmovieItem(MovieItem item){
    movieItems.add(item);

}
public void printmovieDetails(){
    for(MovieItem item: movieItems)
    item.printDetails();
}


}
