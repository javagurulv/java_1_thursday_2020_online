package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Penalty {
    NotReturnedBooks notReturnedBooks = new NotReturnedBooks();

    private BigDecimal penaltySize = new BigDecimal("0");

    public BigDecimal getPenaltySize() { return penaltySize; }

    public void setPenaltySize(BigDecimal penaltySize) { this.penaltySize = penaltySize; }

    public BigDecimal getReaderPenalty(Reader reader) {
        //return //reader.getPenalty();
        return new BigDecimal("0");

    }
    public void setReaderPenalty(Library library, Reader reader, LocalDate datePattern) {
        List<Book> readerBooks = notReturnedBooks.createListBookNotReturnReader(library,reader,datePattern);
        if (readerBooks.size() == 0) {
            return;
        }

        BigDecimal penaltySum = new BigDecimal("0");
        for (int index = 0; index < readerBooks.size(); index++) {
            penaltySum = penaltySum.add(getPenaltySize());
        }

        //TakeBook oldValue = library.readersInLibrary.get(reader);
        //List<Book> old = library.readersWhoTakeBooks.get(reader);

        //reader.setPenalty(reader.getPenalty().add(penaltySum));

       // library.readersInLibrary.replace(reader,oldValue);
        //library.readersWhoTakeBooks.replace(reader,old);





    }
    public void resetReaderPenalty(Reader reader) {

    }
    public void setAllReadersPenalty() {

    }


}
