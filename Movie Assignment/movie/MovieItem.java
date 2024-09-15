package movie;




public class MovieItem {
    private String title;
    private String author;

    protected MovieItem(String title, String author){
        this.title=title;
        this.author=author;
    }
    public String gettitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    void printDetails(){
        System.out.println("The movie is called:"+" "+title+" "+"and its author is:"+" "+author);
    }
}
