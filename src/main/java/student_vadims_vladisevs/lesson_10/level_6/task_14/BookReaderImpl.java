package student_vadims_vladisevs.lesson_10.level_6.task_14;

class BookReaderImpl implements BookReader {

    @Override
    public boolean addBookToLibrary(Book book, Library library) {
        if (isBookInLibrary(book, library)){
            return false;
        } else {
            library.addBook(book);
            return true;
        }
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
}
