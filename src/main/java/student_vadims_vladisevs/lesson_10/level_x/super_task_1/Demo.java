package student_vadims_vladisevs.lesson_10.level_x.super_task_1;

class Demo {
    public static void main(String[] args) {

            Context context = new Context(new FahrenheitConverter());
            System.out.println("Temperature in Fahrenheits " + context.executeStrategy(10));

            context = new Context(new KelvinConverter());
            System.out.println("Temperature in Kelvins " + context.executeStrategy(10));

        }
    }

