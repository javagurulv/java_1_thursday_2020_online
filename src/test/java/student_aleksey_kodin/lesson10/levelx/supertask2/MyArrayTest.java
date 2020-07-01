package student_aleksey_kodin.lesson10.levelx.supertask2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {
    private final MyArray myArray = new MyArray();

    @Test
    public void create_Array() {
        int[] result = myArray.create();

        int size = myArray.size(result);

        assertEquals(0,size);
    }

    @Test
    public void add_0_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);

        int result = array[0];
        int size = array.length;

        assertEquals(5,result);
        assertEquals(1,size);
    }

    @Test
    public void add_1_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);

        int result = array[1];
        int size = array.length;

        assertEquals(10,result);
        assertEquals(2,size);
    }

    @Test
    public void add_2_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);

        int result = array[2];
        int size = array.length;

        assertEquals(15,result);
        assertEquals(3,size);
    }

    @Test
    public void add_3_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = array[3];
        int size = array.length;

        assertEquals(20,result);
        assertEquals(4,size);
    }

    @Test
    public void add_Index_0() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,0,0);

        int result = array[0];
        int size = array.length;

        assertEquals(0,result);
        assertEquals(5,size);
    }

    @Test
    public void add_Index_1() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,1,0);

        int result = array[1];
        int size = array.length;

        assertEquals(0,result);
        assertEquals(5,size);
    }

    @Test
    public void add_Index_2() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,2,0);

        int result = array[2];
        int size = array.length;

        assertEquals(0,result);
        assertEquals(5,size);
    }

    @Test
    public void add_Index_3() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,3,0);

        int result = array[3];
        int size = array.length;

        assertEquals(0,result);
        assertEquals(5,size);
    }

    @Test
    public void add_Index_4() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,4,0);

        int result = array[4];
        int size = array.length;

        assertEquals(0,result);
        assertEquals(5,size);
    }

    @Test
    public void add_Index_Less_Zero() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,-3,0);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void add_Index_More_Array() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.add(array,6,0);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void get_Index_Out_of_Bound() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = myArray.get(array,4);

        assertEquals(-1,result);
    }

    @Test
    public void get_Index_Less_Zero() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = myArray.get(array,-3);

        assertEquals(-1,result);
    }

    @Test
    public void get_Index_0_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = myArray.get(array,0);

        assertEquals(5,result);
    }

    @Test
    public void get_Index_1_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = myArray.get(array,1);

        assertEquals(10,result);
    }

    @Test
    public void get_Index_2_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = myArray.get(array,2);

        assertEquals(15,result);
    }

    @Test
    public void get_Index_3_element() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        int result = myArray.get(array,3);

        assertEquals(20,result);
    }


    @Test
    public void replace_1() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,0,3);
        int result1 = array[0];
        int result2 = array[3];

        assertEquals(20,result1);
        assertEquals(5,result2);
    }

    @Test
    public void replace_2() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,1,2);
        int result1 = array[1];
        int result2 = array[2];

        assertEquals(15,result1);
        assertEquals(10,result2);
    }

    @Test
    public void replace_3() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,0,1);
        int result1 = array[0];
        int result2 = array[1];

        assertEquals(10,result1);
        assertEquals(5,result2);
    }

    @Test
    public void replace_4() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,3,2);
        int result1 = array[2];
        int result2 = array[3];

        assertEquals(20,result1);
        assertEquals(15,result2);
    }

    @Test
    public void replace_5() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,3,3);
        int result1 = array[3];

        assertEquals(20,result1);

    }

    @Test
    public void replace_IndexA_Less_Zero() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,-5,3);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void replace_IndexB_Less_Zero() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,2,-3);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void replace_IndexA_IndexB_Less_Zero() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,-2,-3);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void replace_IndexA_More_Array() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,5,1);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void replace_IndexB_More_Array() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,0,8);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void replace_IndexA_IndexB_More_Array() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.replace(array,6,8);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void remove_Index_0() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,0);

        int result = array[0];
        int size = array.length;

        assertEquals(10,result);
        assertEquals(3,size);
    }

    @Test
    public void remove_Index_1() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,1);

        int result = array[1];
        int size = array.length;

        assertEquals(15,result);
        assertEquals(3,size);
    }

    @Test
    public void remove_Index_2() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,2);

        int result = array[2];
        int size = array.length;

        assertEquals(20,result);
        assertEquals(3,size);
    }

    @Test
    public void remove_Index_3() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,3);

        int result = array[2];
        int size = array.length;

        assertEquals(15,result);
        assertEquals(3,size);
    }

    @Test
    public void remove_Index_Last_Element_1() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,3);
        array = myArray.remove(array,2);

        int result = array[1];
        int size = array.length;

        assertEquals(10,result);
        assertEquals(2,size);
    }

    @Test
    public void remove_Index_Last_Element_2() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,3);
        array = myArray.remove(array,2);
        array = myArray.remove(array,1);

        int result = array[0];
        int size = array.length;

        assertEquals(5,result);
        assertEquals(1,size);
    }

    @Test
    public void remove_Index_Last_Element_3() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,3);
        array = myArray.remove(array,2);
        array = myArray.remove(array,1);
        array = myArray.remove(array,0);

        int size = array.length;

        assertEquals(0,size);
    }

    @Test
    public void remove_Index_Less_Zero() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,-5);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void remove_Index_More_Array() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        array = myArray.add(array,20);

        array = myArray.remove(array,6);

        int result1 = array[0];
        int result2 = array[1];
        int result3 = array[2];
        int result4 = array[3];
        int size = array.length;

        assertEquals(5,result1);
        assertEquals(10,result2);
        assertEquals(15,result3);
        assertEquals(20,result4);
        assertEquals(4,size);
    }

    @Test
    public void removeAll() {
        int[] array = myArray.create();
        array = myArray.add(array,5);
        array = myArray.add(array,10);
        array = myArray.add(array,15);
        myArray.add(array,20);

        array = myArray.removeAll();

        int size = array.length;

        assertEquals(0,size);
    }
}