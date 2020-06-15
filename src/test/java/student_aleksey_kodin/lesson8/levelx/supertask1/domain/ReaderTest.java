package student_aleksey_kodin.lesson8.levelx.supertask1.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ReaderTest {
    Reader reader = new Reader();
    @Before
    public void setUp() {
        reader.setClientName("User Name");
        reader.setClientSurname("User Surname");
    }

    @Test
    public void getClientName() {
        String result = reader.getClientName();
        assertEquals("User Name",result);
    }

    @Test
    public void getClientSurname() {
        String result = reader.getClientSurname();
        assertEquals("User Surname",result);
    }
}