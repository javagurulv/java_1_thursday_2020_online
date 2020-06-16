package student_vadim_sokolenko.Lesson6Code;

class ArrayExample {

    public static void main(String[] args) {

        //9, 3, 4, 6, 7, 5, 0, ....

        int mark1 = 9;
        int mark2 = 2;
        int mark3 = 3;
        int mark4 = 4;
        int mark5 = 6;


        // |
        //

        int[] marks = new int[4];

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

// Primitive data type: int, float, boolean

        marks[0] =6;
        marks[1] =9;
        marks[2] =3;
        marks[3] =5;



        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);




        int sum = marks[0] + marks[1] +marks[2] + marks[3];
        System.out.println(sum);

        //marks[4] = 0; rrayIndexOutOfBoundsException: Index 4 out of bounds for length 4


        System.out.println("ArrayLength=" +marks.length);
    }
}
