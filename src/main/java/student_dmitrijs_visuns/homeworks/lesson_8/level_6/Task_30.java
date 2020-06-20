package student_dmitrijs_visuns.homeworks.lesson_8.level_6;

/*Узнать в интернете, что такое varargs.
        Придумайте пример кода, в котором продемонстрируйте
        использование varargs.*/

class Task_30 {

    public static void main(String args[])
    {
        varArgsDemonstration("John", "Boris");
        varArgsDemonstration("Robot1", "Robot2", "Robot3", "Robot4", "Robot5");
    }



    static void varArgsDemonstration(String...inputNames) {
        System.out.println("Number of names provided: " + inputNames.length);
        for (String i: inputNames) {
            System.out.print(i + " ");
        }
        System.out.println();
    }



}
