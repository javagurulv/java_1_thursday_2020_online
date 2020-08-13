package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_27;

class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader: " + this.name + " in " + this.city;
    }
}