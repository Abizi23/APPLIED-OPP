import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Members> members;

    public Library(){
        this.books=new ArrayList<Book>();
        this.members=new ArrayList<Members>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Members> getMembers() {
        return members;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void registerMember(Members member){
        this.members.add(member);
    }

    public void lendBook(String isbn,String memberID){
        Book desiredBook = findBookByIsbn(isbn);
        Members desiredMember = findMemberByID(memberID);

        if (desiredBook!= null) {
            System.out.println("desired book is available");
            desiredMember.borrowBook(desiredBook);
            System.out.println("successfully borrowed book ");
            int bookCopies = desiredBook.getCopiesAvailable();
            bookCopies=bookCopies-1;
            desiredBook.setCopiesAvailable(bookCopies);
            System.out.println("Number of copies available after lending is : " + desiredBook.getCopiesAvailable());
        }

        else{
            System.out.println("desired book is not available");
        }


    }

    private Book findBookByIsbn(String isbn){
        for (Book book : books) {
            if (book.getIsbn() == (isbn)) {
                return book;
            }
        }
        
        return null;
    }

     private Members findMemberByID(String memberID){
        Members desiredMember=null;
        for (Members member : members) {
            if (member.getMemberId().equals(memberID)) {
                return member;
            }
        }
        return null;
    }




}