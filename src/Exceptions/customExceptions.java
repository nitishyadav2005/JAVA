package Exceptions;

class BookUnavailableException extends Exception{
    public BookUnavailableException(String message){
        super(message);
    }
}

class InvalidMemberException extends Exception{
    public InvalidMemberException(String message){
        super(message);
    }
}

class Library1 {
    int availableBooks = 3;

    public void borrowBook( String memberName, int booksRequestedCount) throws Exception {
        if (booksRequestedCount > availableBooks)
            throw new BookUnavailableException("Not enough books available");
        if(booksRequestedCount < 0)
            throw new Exception("You must request at least one book ");
        if(memberName == null || memberName.isEmpty())
            throw new InvalidMemberException("Invalid membership");
    }
}

public class customExceptions {
    public static void main(String[] args) {
        Library1 library = new Library1();
        try{
            library.borrowBook("john", 1);
            library.borrowBook("", 1);
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        }
    }
}