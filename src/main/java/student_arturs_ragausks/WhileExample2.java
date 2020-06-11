package student_arturs_ragausks;

class WhileExample2 {

    public static void main(String[] args) {
        int number = 1;
        int sum = number;
        while (sum < 100) {
            sum += number;
            number++;
            System.out.println("Number = " + number + "Sum = " + sum);
            number++;

        }

    }



}
