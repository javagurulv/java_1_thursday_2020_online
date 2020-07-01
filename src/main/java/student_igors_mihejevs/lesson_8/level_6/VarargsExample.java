package student_igors_mihejevs.lesson_8.level_6;

class VarargsExample {

    static int sum(int ... numbers) {

        int result = 0;
        for(int i : numbers) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        System.out.println(sum(5,4,3,2,1));
    }

}
