package student_diana_miranovica.lesson6.lesson_code;

 class ContinueExample {

     public static void main(String[] args) {
         //int[][] arr = new int [5][5];
         int[][] arr = {{0,1,0},
                 {4,5,7},
                 {7,3,2}};
         for (int i = 0; i < arr.length; i++){

             for (int j = 0; j < arr[i].length; j++){
                 int number = arr[i][j];
                /* if(i==1) {
                     continue;//передача в конец итерации цикла
                 }*/
                 System.out.println(""  + i + "," + j + "  = "+ number);
                 //break;
             }
             //break;
         }
     }
}
