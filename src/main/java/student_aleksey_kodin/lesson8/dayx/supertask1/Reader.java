package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Reader {
    private int clientNumber;
    private String clientName;
    private String clientSurname;
    List<Book> readerBook = new ArrayList<>();

    public Reader (int clientNumber, String clientName, String clientSurname) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
    }
    public int getClientNumber() {
        return clientNumber;
    }
    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getClientSurname() {
        return clientSurname;
    }
    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public void takeBook(Book book,DatesUsingBook datesUsingBook) {
        book.datesUsingBooks.add(datesUsingBook);
        readerBook.add(book);
    }    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return clientNumber == reader.clientNumber &&
                clientName.equals(reader.clientName) &&
                clientSurname.equals(reader.clientSurname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientNumber, clientName, clientSurname);
    }
}
