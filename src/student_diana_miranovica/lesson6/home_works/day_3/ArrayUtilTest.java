package student_diana_miranovica.lesson6.home_works.day_3;

class ArrayUtilTest {
     public static void main(String[] args) {
         ArrayUtilTest test = new ArrayUtilTest();
         test.shouldCreateArray();
         test.shouldFillArrayWithRandomNumbers();
         test.printArray();
         test.shouldFindMaxNumber();
         test.shouldFindMinNumber();
         test.isContainingCertainNumberTest();

     }
     public void isContainingCertainNumberTest(){
         boolean expResult = true;
         ArrayUtil arrayUtil = new ArrayUtil();
         int[] arrayTest8 = arrayUtil.createArray(4);
         arrayTest8[0] = 2;
         arrayTest8[1] = 5;
         arrayTest8[2] = 15;
         arrayTest8[3] = 3;
         boolean actualResult = arrayUtil.isContainingCertainElement(arrayTest8,15);

         if (actualResult == expResult){
             System.out.println("isContainingCertainNumberTest - OK");
         }else {
             System.out.println("isContainingCertainNumberTest - False");
         }
     }



     public void shouldCreateArray() {
         // Write test implementation here !!!
         ArrayUtil arrayUtil = new ArrayUtil();
         int[] arrayTest = arrayUtil.createArray(4);
         if (arrayTest.length == 4) {
             System.out.println("shouldCreate test - ok");
         } else {
             System.out.println("shouldCreate test - fail");
         }
     }
     public void shouldFillArrayWithRandomNumbers() {
         ArrayUtil arrayUtil2 = new ArrayUtil();
         int[] arrayTest2 = arrayUtil2.createArray(8);
         arrayUtil2.fillArrayWithRandomNumbers(arrayTest2);

         int sum = 0;
         if ( sum >= 0){
             System.out.println("fillArrayWithRandomNumbers is - OK");
         }else {
             System.out.println("fillArrayWithRandomNumbers is - Fail");
         }
     }
     public void printArray() {
         ArrayUtil arrayUtil6 = new ArrayUtil();

         int arrayLength = 12;
         int[] arrayTest6 = arrayUtil6.createArray(arrayLength);
         arrayUtil6.fillArrayWithRandomNumbers(arrayTest6);
         System.out.println("Printing array of length " +"["+ arrayLength+"]" + " filling with random numbers to console:");
         arrayUtil6.printArrayToConsole(arrayTest6);
     }
     public void shouldFindMaxNumber() {
       ArrayUtil arrayUtil4 = new ArrayUtil();

         int arrayLength = 7;
         int[] arrayTest4 = arrayUtil4.createArray(arrayLength);
         int counter = 0;
         while (counter < arrayLength ) {
             arrayTest4[counter] = counter + 1;
             counter++;
         }
         if (arrayUtil4.findMaxNumber(arrayTest4) == 7) {
             System.out.println("Test of maximum number of array - OK");
         } else {
             System.out.println("Test of maximum number of array - FAIL");
         }
     }

     public void shouldFindMinNumber() {
         ArrayUtil arrayUtil5 = new ArrayUtil();

         int arrayLength = 7;
         int[] arrayTest5 = arrayUtil5.createArray(arrayLength);
         int counter = 0;
         while (counter < arrayLength ) {
             arrayTest5[counter] = counter + 1;
             counter++;
         }
         if (arrayUtil5.findMinNumber(arrayTest5) == 1) {
             System.out.println("Test of minimum number of array - OK");
         } else{
             System.out.println("Test of minimum number of array - FAIL");
         }
     }

}
