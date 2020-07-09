package student_vadims_vladisevs.lesson_10.level_6.task_20;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    @Override
    public boolean addBookToLibrary(Book book, Library library) {

        if (!isAuthorAndTitle(book)){
            return false;
        }

        if (isBookInLibrary(book, library)){
            return false;
        }


        library.addBook(book);
        return true;
    }

    private boolean isBookInLibrary(Book book, Library library){
        return checkTitle(book, library) && checkAuthor(book, library);
    }

    private boolean checkAuthor(Book book, Library library){
        for (Book tempBook : library.getBooks()){
            if (tempBook.getAuthor().equals(book.getAuthor())){
                return true;
            }
        }
        return false;
    }

    private boolean checkTitle(Book book, Library library){
        for (Book tempBook : library.getBooks()){
            if (tempBook.getTitle().equals(book.getTitle())){
                return true;
            }
        }
        return false;
    }

    private boolean isAuthorAndTitle(Book book){
        return isAuthor(book) && isTitle(book);
    }

    private boolean isTitle(Book book){
        return book.getTitle() != null;
    }

    private boolean isAuthor(Book book){
        return book.getAuthor() != null;
    }



    @Override
    public boolean removeBookFromLibrary(Book book, Library library) {
        if (isBookInLibrary(book,library)){
            library.getBooks().remove(library.getBookIndex(book));
            return true;
        }
        return false;
    }

    @Override
    public String[] listOfBook(Library library) {
        String[] listOfBook = new String[library.getBooks().size()];
        for (int i = 0; i < library.getBooks().size(); i++){
            listOfBook[i] = library.getBooks().get(i).getTitle() + " [" + library.getBooks().get(i).getAuthor() + "]";
        }
        return listOfBook;
    }

    @Override
    public ArrayList<Book> findByAuthor(String author, Library library) {
       ArrayList<Book> listByAuthor = new ArrayList<>();

       for (Book tempBook : library.getBooks()){
           if (tempBook.getAuthor().contains(author)){
               listByAuthor.add(tempBook);
           }
       }

        return listByAuthor;
    }

    @Override
    public ArrayList<Book> findByTitle(String title, Library library) {
        ArrayList<Book> listByTitle = new ArrayList<>();

        for (Book tempBook : library.getBooks()){
            if (tempBook.getTitle().equals(title)){
                listByTitle.add(tempBook);
            }
        }

        return listByTitle;
    }


}
