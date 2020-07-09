package student_vadims_vladisevs.lesson_10.level_6.task_15;

class BookReaderImpl implements BookReader {

    @Override
    public boolean addBookToLibrary(Book book, Library library) {

        if (!isAuthorAndTitle(book)){
            return false;
        }

        if (isTitleOrAuthorEmpty(book)){
            return false;
        }

        if (isBookInLibrary(book, library)){
            return false;
        }


        library.addBook(book);
        return true;
    }

    private boolean isTitleOrAuthorEmpty(Book book){
        return book.getTitle().isEmpty() || book.getAuthor().isEmpty();
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
