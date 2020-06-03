package student_vadim_sokolenko.Lesson6Code;

public class ContinueExample {

    public static void main(String[] args) {

        int[][] arr = {{0, 1, 0},
                {4, 5, 9,},
                {7, 8, 0}};
        //вложенные циклы фор
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int number = arr[i][j];
                if (j == 1) {
                    continue;
                }
                System.out.println("" + i + "," + j + "=" + number);
            }
        }
    }
}
