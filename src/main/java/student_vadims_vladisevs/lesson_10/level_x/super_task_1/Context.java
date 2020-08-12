package student_vadims_vladisevs.lesson_10.level_x.super_task_1;

class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(double celsiusTemperature){
        return strategy.convert(celsiusTemperature);
    }

}
