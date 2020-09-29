package student_diana_miranovica.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDuplicates {

    public static void main(String[] args) {

        List<Integer> telephoneNumbers = new ArrayList<>();

        telephoneNumbers.add(26963947);
        telephoneNumbers.add(29863714);
        telephoneNumbers.add(26046154);
        telephoneNumbers.add(26963947);

        for (Integer number: telephoneNumbers ){
            System.out.println(number);
        }

        System.out.println("List telephoneNumbers size is " + telephoneNumbers.size());

        List<String> autoMarks = new LinkedList<>();

        autoMarks.add("VW");
        autoMarks.add("Mercedes");
        autoMarks.add("VW");
        autoMarks.add("Toyota");

        for (String auto : autoMarks){
            System.out.println(auto);
        }




    }
}
