package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level3;

class TvController {

    private String connectionTvName;
    private Tv tvController;

    public static void main(String[] args) {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
    }
    private void setConnectionWithTv(Tv tv) {
        tvController = tv;
        connectionTvName = tv.getManufacturer();
    }
    public void setOnThroughController(boolean isTvOn) {
        tvController.setTvOn(isTvOn);
    }
    public void nextChannelThroughController() {
        tvController.nextChannel();
    }
    public void prevChannelThroughController() {
        tvController.prevChannel();
    }
    public void volumeUpThroughController() {
        tvController.volumeUp();
    }
    public void volumeDownThroughController() {
        tvController.volumeDown();
    }
    public String getConnectionTvName() {
        return connectionTvName;
    }
}
