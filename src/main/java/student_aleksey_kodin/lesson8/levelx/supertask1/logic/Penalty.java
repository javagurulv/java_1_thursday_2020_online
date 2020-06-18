package student_aleksey_kodin.lesson8.levelx.supertask1.logic;

import student_aleksey_kodin.lesson8.levelx.supertask1.domain.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Penalty {
    NotReturnedBooks notReturnedBooks = new NotReturnedBooks();

    private BigDecimal penaltySize = new BigDecimal("0");

    public BigDecimal getPenaltySize() {
        return penaltySize;
    }

    public void setPenaltySize(BigDecimal penaltySize) {
        this.penaltySize = penaltySize;
    }

    public boolean setReaderPenalty(Library library, Reader reader, LocalDate datePattern) {
        List<Book> readerBooks = notReturnedBooks.createListBookNotReturnReader(library, reader, datePattern);
        if (isNotReturnedBookListEmpty(readerBooks)) {
            resetReaderPenalty(reader);
            return false;
        }

        BigDecimal penaltySum = new BigDecimal("0");
        for (int index = 0; index < readerBooks.size(); index++) {
            penaltySum = penaltySum.add(getPenaltySize());
        }

        resetReaderPenalty(reader);
        reader.setPenalty(penaltySum);
        return true;
    }

    public void setAllReadersPenalty(Library library, LocalDate datePattern) {
        Set<Reader> allReaders = library.readersWhoTakeBooks.keySet();

        for (Reader checkReaderToPenalty : allReaders) {
            setReaderPenalty(library, checkReaderToPenalty, datePattern);
        }
    }

    private void resetReaderPenalty(Reader reader) {
        reader.setPenalty(new BigDecimal("0"));
    }

    private boolean isNotReturnedBookListEmpty(List<Book> readerBooks) {
        final int EMPTY_LIST = 0;
        return readerBooks.size() == EMPTY_LIST;
    }
}
