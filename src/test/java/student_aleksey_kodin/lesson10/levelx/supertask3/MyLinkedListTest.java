package student_aleksey_kodin.lesson10.levelx.supertask3;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyLinkedListTest {
    private final MyLinkedList myLinkedList = new MyLinkedList();

    @Test
    public void add_1_element() {
        myLinkedList.add(10);
        boolean result =myLinkedList.contains(10);

        assertTrue(result);
    }

    @Test
    public void add_2_elements() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        boolean result =myLinkedList.contains(15);

        assertTrue(result);
    }

    @Test
    public void add_3_elements() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        boolean result =myLinkedList.contains(20);

        assertTrue(result);
    }

    @Test
    public void add_Use_Index_0_element() {
        myLinkedList.add(0,10);

        boolean result =myLinkedList.contains(10);

        assertTrue(result);
    }

    @Test
    public void add_Use_Index_1_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(1,10);

        int result =myLinkedList.get(1);

        assertEquals(10,result);
    }

    @Test
    public void add_Use_Index_2_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(2,0);

        int result =myLinkedList.get(2);

        assertEquals(0,result);
    }

    @Test
    public void add_Index_Out_Of_Bound() {
        boolean result =  myLinkedList.add(1,10);

        assertFalse(result);
    }

    @Test
    public void get_0_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);

        int result =myLinkedList.get(0);

        assertEquals(10,result);
    }

    @Test
    public void get_1_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);

        int result =myLinkedList.get(1);

        assertEquals(15,result);
    }

    @Test
    public void get_2_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);

        int result =myLinkedList.get(2);

        assertEquals(20,result);
    }

    @Test
    public void get_3_Index_Less_Zero() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);

        int result =myLinkedList.get(-4);

        assertEquals(-1,result);
    }

    @Test
    public void get_4_Index_Out_Of_Bound() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);

        int result =myLinkedList.get(6);

        assertEquals(-1,result);
    }

    @Test
    public void replace_1_attempt() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.replace(0,3);

        int result = myLinkedList.get(0);

        assertEquals(25,result);
    }

    @Test
    public void replace_2_attempt() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.replace(1,2);

        int result = myLinkedList.get(1);

        assertEquals(20,result);
    }

    @Test
    public void replace_3_attempt() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.replace(2,0);

        int result = myLinkedList.get(2);

        assertEquals(10,result);
    }

    @Test
    public void replace_4_attempt() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.replace(2,2);

        int result = myLinkedList.get(2);

        assertEquals(20,result);
    }

    @Test
    public void replace_5_attempt_IndexA_Out_Of_Bound() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.replace(4,2);

        assertFalse(result);
    }

    @Test
    public void replace_6_attempt_IndexB_Out_Of_Bound() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.replace(1,6);

        assertFalse(result);
    }

    @Test
    public void replace_7_attempt_IndexA_and_IndexB_Out_Of_Bound() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.replace(4,4);

        assertFalse(result);
    }

    @Test
    public void replace_8_attempt_IndexA_and_IndexB_Less_Zero() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.replace(-1,-4);

        assertFalse(result);
    }

    @Test
    public void replace_9_attempt_IndexA_Less_Zero() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.replace(-1,2);

        assertFalse(result);
    }

    @Test
    public void replace_10_attempt_IndexB_Less_Zero() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.replace(3,-3);

        assertFalse(result);
    }

    @Test
    public void remove_1_attempt_Index_Less_Zero() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.remove(-1);

        assertFalse(result);
    }

    @Test
    public void remove_2_attempt_Index_Out_Of_Bound() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        boolean result = myLinkedList.remove(4);

        assertFalse(result);
    }

    @Test
    public void remove_3_attempt_0_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.remove(0);
        boolean result = myLinkedList.contains(10);

        assertFalse(result);
    }

    @Test
    public void remove_4_attempt_3_element() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.remove(3);
        boolean result = myLinkedList.contains(25);

        assertFalse(result);
    }



    @Test
    public void removeAll() {
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        myLinkedList.add(25);

        myLinkedList.removeAll();

        int result = myLinkedList.size();

        assertEquals(0,result);
    }
}