package student_vadims_vladisevs.lesson_10.level_x.super_task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {
    List myArray = new List();
    int[] array = myArray.createArray(5);

    @Test
    public void addToEndOfTheList_v1() {
        int[] newArray = myArray.addToEndOfTheList(5);
        assertEquals(5, newArray[newArray.length-1]);
    }

    @Test
    public void addToEndOfTheList_v2() {
        int[] newArray = myArray.addToEndOfTheList(5);
        assertEquals(6, newArray.length);

    }

    @Test
    public void addToBeginOfTheList_v1() {
        int[] newArray = myArray.addToBeginOfTheList(3);
        assertEquals(3, newArray[0]);
    }

    @Test
    public void addToBeginOfTheList_v2() {
        int[] newArray = myArray.addToBeginOfTheList(3);
        assertEquals(6, newArray.length);
    }

    @Test
    public void addToList() {
    }

    @Test
    public void replace_v1() {
        array = myArray.replace(3,4);
        assertEquals(4, array[3]);
    }
    @Test
    public void replace_v2() {
        array = myArray.replace(4, 1);
        array = myArray.replace(0,3);
        assertEquals(3, array[0]);
        assertEquals(1, array[4]);
    }

    @Test
    public void replaceAll_v1() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array = myArray.replaceAll(5);
        assertEquals(5,array[0]);
        assertEquals(5,array[1]);
        assertEquals(5,array[2]);
        assertEquals(5,array[3]);
        assertEquals(5,array[4]);

    }
    @Test
    public void replaceAll_v2() {
        array = myArray.replaceAll(1);
        assertEquals(1,array[0]);
        assertEquals(1,array[1]);
        assertEquals(1,array[2]);
        assertEquals(1,array[3]);
        assertEquals(1,array[4]);
    }

    @Test
    public void getFromList_v1() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int actual = myArray.getFromList(0);
        assertEquals(1, actual);
    }

    @Test
    public void getFromList_v2() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int actual = myArray.getFromList(3);
        assertEquals(4, actual);
    }

    @Test
    public void removeFromList_v1() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array = myArray.removeFromList(array,4);
        assertEquals(4, array.length);
        assertEquals(1,array[0]);
        assertEquals(2,array[1]);
        assertEquals(3,array[2]);
        assertEquals(4,array[3]);
    }

    @Test
    public void removeFromList_v2() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array = myArray.removeFromList(array,0);
        array = myArray.removeFromList(array,0);
        array = myArray.removeFromList(array, 0);
        assertEquals(2, array.length);
        assertEquals(4,array[0]);
        assertEquals(5,array[1]);
    }

    @Test
    public void removeAllFromList_v1() {
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array = myArray.removeAllFromList();
        assertEquals(0, array.length);
    }


    @Test
    public void sort_v1() {
        array[0] = 2;
        array[1] = 4;
        array[2] = 5;
        array[3] = 3;
        array[4] = 1;

        int[] actual = myArray.sort(array);
        assertEquals(1, actual[0]);
        assertEquals(5, actual[4]);
    }
    @Test
    public void sort_v2() {
        array[0] = -2;
        array[1] = 42;
        array[2] = 53;
        array[3] = 334;
        array[4] = -1324;

        int[] actual = myArray.sort(array);
        assertEquals(-1324, actual[0]);
        assertEquals(334, actual[4]);
    }
}