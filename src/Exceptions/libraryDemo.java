package Exceptions;

class Library {
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {
        if (booksRequestedCount > availableBooks)
            throw new Exception("Not enough books available");

    }
    }

    public class libraryDemo {
        static void main(String[] args) {
            Library library = new Library();
            try{
            library.borrowBook(10);
        } catch (Exception e) {
                //e.printStackTrace();
                //System.out.println("Exception occurred");
                System.out.println(e.getMessage());
            }
            }
    }


//    public void borrowBook(int booksRequestedCount){
//        try {
//            if ( booksRequestedCount > availableBooks)
//                throw new Exception("Not enough books available");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception occurred you requested a book that not occurred in library");
//        } catch (Exception e){
//            System.out.println("exception");
//        } finally {
//            System.out.println("Finally block");
//        }
//
//    }
