package student_diana_miranovica.lesson6.home_works.day_4;

 class TwoDimensionalArray {

     public int[][] createDoubleArray(int row, int column){
         return new int[row][column];
     }

     public void addRandomArrayValue(int[][]twoDimArr) {

         for (int row = 0; row < twoDimArr.length; row++) {
             for (int column = 0; column < twoDimArr[row].length; column++) {
                 int number = twoDimArr[row][column];
                 System.out.println("" + row + "," + column + "  = " + number);
             }
         }

     }
     public void printToConsole(int[][]twoDimArr){
         for (int[]row : twoDimArr){
             System.out.println();
             for (int column = 0; column < twoDimArr.length; column++){
                 System.out.println(row[column]+ " ");
             }
         }
         System.out.println();
     }



}
