import java.util.List;

public class Members{
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Members(String name,String memberId){
        this.name=name;
        this.memberId=memberId;
    }
    public String getMemberId() {
        return memberId;
    }
    public String getmemberId(){
        return memberId;
    }
    public void borrowBook(Book book){
        addBookToBorrowedList(book);
        
    }
    private void addBookToBorrowedList(Book book){
        borrowedBooks.add(book);
    }
}