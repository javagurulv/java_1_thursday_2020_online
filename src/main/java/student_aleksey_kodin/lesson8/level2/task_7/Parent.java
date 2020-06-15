package student_aleksey_kodin.lesson8.level2.task_7;

class Parent {
     Parent(String name) {
         System.out.println("Firstly running constructor parent's class");
         System.out.println(name);
     }
}
class Child extends Parent {
    Child(String name) {
        super("For parent class argument can will be another");
        System.out.println("After running constructor child's class");
        System.out.println(name);
    }
}
class Demo {
    public static void main(String[] args) {
        Child child = new Child("This is argument for child class");

    }
}