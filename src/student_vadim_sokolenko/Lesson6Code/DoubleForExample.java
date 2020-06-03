package student_vadim_sokolenko.Lesson6Code;

public class DoubleForExample {

    public static void main(String[] args) {

        int[][] arr =  {{0,1,0},
                        {4,5,9,},
                         {7,8,0}};
        //вложенные циклы фор
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                int number = arr[i][j];
                System.out.println(""+i+","+j+ "="+number);
                break;
                //завершает работу цикла в котором находится
            }
            //break;
        }


    }
}
