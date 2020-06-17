package student_vadims_vladisevs.lesson8.day_6.Task_30;

class VarargsExample {

    public int sum(int...numbers) {
        int result = 0;
        for(int i : numbers) {
            result += i;
        }
        return result;
    }

}
