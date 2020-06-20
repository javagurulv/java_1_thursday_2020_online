package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import java.math.BigDecimal;
import java.util.*;

public class Reader {
    private String clientName;
    private String clientSurname;
    private BigDecimal penalty = new BigDecimal("0");
    List<Book> readerBook = new ArrayList<>();

    public Reader() {
    }

    public Reader(String clientName, String clientSurname) {
        this.clientName = clientName;
        this.clientSurname = clientSurname;
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

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return clientName.equals(reader.clientName) &&
                clientSurname.equals(reader.clientSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientSurname);
    }
}
