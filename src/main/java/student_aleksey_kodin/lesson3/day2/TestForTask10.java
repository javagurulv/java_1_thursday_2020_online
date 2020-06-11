package student_aleksey_kodin.lesson3.day2;

class TestForTask10 {

    public static void main(String[] args) {

        String name = "Ivan";
        String nextName = "Ivan";
        String oneMoreName = "Ivan";

        System.out.println(name == nextName);
        System.out.println(name == oneMoreName);
        System.out.println(nextName == oneMoreName);
        System.out.println();
        System.out.println(Integer.toHexString(System.identityHashCode(name)));
        System.out.println(Integer.toHexString(System.identityHashCode(nextName)));
        System.out.println(Integer.toHexString(System.identityHashCode(oneMoreName)));
        System.out.println();
        System.out.println(name.equals(nextName));
        System.out.println(name.equals(oneMoreName));
        System.out.println(nextName.equals(oneMoreName));
    }
}
