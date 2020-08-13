package student_igors_mihejevs.lesson_3.homework.level_2;

import java.util.Scanner;

class StringsCompare {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        System.out.print("Input your first string: ");
        String str1 = myInput.next();
        System.out.print("Input your second string: ");
        String str2 = myInput.next();
        System.out.print("Input your third string: ");
        String str3 = myInput.next();

        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("\n" + result + " - " + str1 + " lexicographically equal to " + str2);
        } else {
            System.out.println("\n" + result + " - " + str1 + " lexicographically not equal to " + str2);
        }

        result = str2.compareTo(str3);
        if (result == 0) {
            System.out.println("\n" + result + " - " + str2 + " lexicographically equal to " + str3);
        } else {
            System.out.println("\n" + result + " - " + str2 + " lexicographically not equal to " + str3);
        }

        result = str3.compareTo(str1);
        if (result == 0) {
            System.out.println("\n" + result + " - " + str3 + " lexicographically equal to " + str1);
        } else {
            System.out.println("\n" + result + " - " + str3 + " lexicographically not equal to " + str1);
        }
    }
}
