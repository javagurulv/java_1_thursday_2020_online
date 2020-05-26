package student_dmitrijs_visuns.homeworks.lesson_5.day_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {

        ArrayUtil testArray = new ArrayUtil();
        int[] result = testArray.createArray(5);

        if (result.length == 5) {
            System.out.println("Array create test - OK");
        } else {
            System.out.println("Array create test - FAIL");
        }
    }

}
