package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Book;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Library;
import student_aleksey_kodin.lesson8.levelx.supertask1.domain.Reader;

import java.util.List;

public class Notification implements SendMessage {

    public String createMessage(Library library, Reader reader) {

        StringBuilder message = new StringBuilder("User: " + reader.getClientName() + " " +
                reader.getClientSurname() + "\n");

        List<Book> readerBooks = Finder.getAllBooksForReader(library, reader);

        if (isNotBooks(readerBooks)) {
            return message.append("No books").toString();
        }

        message.append("You need return book(s):\n");

        for (Book book : readerBooks) {
            message.append("Book's author: ").append(book.getAuthor()).append(" Book's name: ").
                    append(book.getBookName()).append(" Returned date: ").
                    append(Finder.getFinishDateForBook(library, book)).append("\n");
        }
        return message.toString();
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    private boolean isNotBooks(List<Book> readerBooks) {
        final int EMPTY_LIST = 0;
        return readerBooks.size() == EMPTY_LIST;
    }
}
