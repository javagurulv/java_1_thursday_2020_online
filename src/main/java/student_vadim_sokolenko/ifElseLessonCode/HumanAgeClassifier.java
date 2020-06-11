package student_vadim_sokolenko.ifElseLessonCode;

class HumanAgeClassifier {

    public String classify(int age) {
        if (age >= 0 && age <= 3) {
            return "baby";
        } else if (age > 3 && age <= 12) {
            return "children";
        } else if (age > 12 && age <= 18) {
            return "teenager";
        } else if (age > 18 && age <= 65) {
            return "hard working depressed person";
        } else if (age > 65 && age <= 150){
            return "senior";
        } else {
            return "Incorrect data";


        }

    }
}
