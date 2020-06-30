package student_diana_miranovica.lesson_7.homework.day_6.task_13;



import java.util.Arrays;

class CopyTest {
     public static void main(String[] args) {

         CopyTest copyTest = new CopyTest();
         copyTest.copyInRangeTest1();
         copyTest.copyInRangeTest2();
         copyTest.copyInRangeTest3();

     }
     public void copyInRangeTest1(){
         Copy copy = new Copy();
         int[] in = {0,3,6,9,12,15};
         int[] result = copy.copyInRange(in,0,2);
         int[] resultToCompare = {0,3,6};
         if (Arrays.equals(result, resultToCompare)) {
             System.out.println("copyInRangeTest1 - OK");
         } else {
             System.out.println("copyInRangeTest1 - Fail");
         }

     }
    public void copyInRangeTest2(){
        Copy copy = new Copy();
        int[] in = {0,3,6,9,12,15};
        int[] result = copy.copyInRange(in,1,5);
        int[] resultToCompare = {3,6,9,12,15};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("copyInRangeTest2 - OK");
        } else {
            System.out.println("copyInRangeTest2 - Fail");
        }

    }
    public void copyInRangeTest3(){
        Copy copy = new Copy();
        int[] in = {1,2,3,4,5,6,7,8,9,10};
        int[] result = copy.copyInRange(in,0,9);
        int[] resultToCompare = {1,2,3,4,5,6,7,8,9,10};
        if (Arrays.equals(result, resultToCompare)) {
            System.out.println("copyInRangeTest3 - OK");
        } else {
            System.out.println("copyInRangeTest3 - Fail");
        }

    }
}
