package student_igors_mihejevs.lesson_3.homework.level_2;

class StringPool {

    public static void main(String[] args) {
        String str1 = "String test";
        String str2 = "String test";
        String str3 = "String test new";
        /*
          JVM search str2 in the pool and see that the same string is already allocated in the pool.
          the Java compiler will simply return a reference to its memory address, without allocating additional memory.
          JVM search str3 in the pool and do not see the same string is already allocated in the pool.
          In this case str3 will be added to the pool (interned) and its reference will be returned.
        */

        String str4 = new String("String test");
        String str5 = new String("String test");
        String str6 = new String("String test new");
        /*
        When we create a String via the new operator, the Java compiler will create a new object
        and store it in the heap space reserved for the JVM.
        Every String created like this (str4, str5 and str6)
        will point to a different memory region with its own address.
         */

        // Example

        System.out.println("Compare two the same strings as literal - "+ (str1 == str2));
        System.out.println("Compare two the same strings as new object - "+ (str4 == str5));
        System.out.println("Compare the same literal string and string as new object - "+ (str1 == str5));

        /*
        In general, we should use the String literal notation when possible.
        It is easier to read and it gives the compiler a chance to optimize our code.
         */
    }

}
