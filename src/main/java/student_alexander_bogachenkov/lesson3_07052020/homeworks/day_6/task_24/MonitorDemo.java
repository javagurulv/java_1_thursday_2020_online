package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_6.task_24;

class MonitorDemo {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("DELL","IPS",
                21.5f, true,false);
        monitor1.infoAboutMonitor();


        Monitor monitor2 = new Monitor("ASUS","LED",
                15.6f, true,true);
        monitor2.infoAboutMonitor();
    }
}
