package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_6.task_24;

class Monitor {

    //statements
    private final String monitorManufacturer;
    private final String screenTechnology;
    private final float screenDiagonal;

    //behavior
    private final boolean isOn;
    private final boolean isConnectedToWifi;

    public Monitor(String manufacturer, String screenTechnology,
                   float screenDiagonal, boolean isOn, boolean isConnectedToWifi) {
        this.monitorManufacturer = manufacturer;
        this.screenTechnology = screenTechnology;
        this.screenDiagonal = screenDiagonal;
        this.isOn = isOn;
        this.isConnectedToWifi = isConnectedToWifi;
    }

    public void infoAboutMonitor() {
        System.out.println("Monitor manufacturer is " + this.monitorManufacturer);
        System.out.println("Screen technology is " + this.screenTechnology);
        System.out.println("Screen diagonal is " + this.screenDiagonal);

        System.out.println("Right now monitor is ON. Right? " + this.isOn);
        System.out.println("Right now monitor is connected to WIFI. Right? " + this.isConnectedToWifi);
    }
}
