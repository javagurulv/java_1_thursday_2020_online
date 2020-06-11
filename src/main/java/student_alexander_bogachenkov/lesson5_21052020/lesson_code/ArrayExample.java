package student_alexander_bogachenkov.lesson5_21052020.lesson_code;

class ArrayExample {
    public static void main(String[] args) {

        // 9, 3, 4, 6, ...

        int[] marks = new int[4];

        marks[0] = 9;
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 6;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        int sum = marks[0] + marks[1] + marks[2] + marks[3];
        System.out.println(sum);

        System.out.println("Array length is " + marks.length);
    }
}
