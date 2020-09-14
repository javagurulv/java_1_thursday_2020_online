package student_edgars_lukjanskis.lession_5;

class ArrayExample {

    public static void main(String[] args) {

        // 9, 3, 4, 6, ...

        int mark1 = 9;
        int mark2 = 3;
        int mark3 = 4;
        int mark4 = 6;

        //       |_|_|_|_|
        // index  0 1 2 3
        int[] marks = new int[4];


        //  int -> 4 byte - new int [4] -> 4 * 4 = 16 bytes RAM

        //  |0|0|0|0|

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);


        // Primitive data type: int, float, boolean

        marks[0] = 9;
        marks[1] = 3;
        marks[2] = 6;
        marks[3] = 4;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        int sum = marks[0] + marks[1] + marks[2] + marks[3];
        System.out.println(sum);

        System.out.println("Array length = " + marks.length );

    }
}