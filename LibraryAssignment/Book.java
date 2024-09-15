public class Book {

    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    Book(String title, String author, String isbn, int copiesAvailable ){
        this.author=author;
        this.title=title;
        this.copiesAvailable=copiesAvailable;
        this.isbn=isbn;

    }
    public String getIsbn(){
        return isbn;
    }
    public void setCopiesAvailable(int copies){
        this.copiesAvailable=copies;
    }
    int getCopiesAvailable() {
        return copiesAvailable;
    }
}
