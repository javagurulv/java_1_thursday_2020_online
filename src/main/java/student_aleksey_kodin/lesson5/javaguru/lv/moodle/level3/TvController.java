package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level3;

class TvController {

    private String connectionTvName;
    private Tv tvThroughController;

    public void setConnectionWithTv(Tv tv) {
        tvThroughController = tv;
        connectionTvName = tv.getManufacturer();
    }

    public void setOnThroughController(boolean isTvOn) {
        tvThroughController.setTvOn(isTvOn);
    }

    public void nextChannelThroughController() {
        tvThroughController.nextChannel();
    }

    public void prevChannelThroughController() {
        tvThroughController.prevChannel();
    }

    public void volumeUpThroughController() {
        tvThroughController.volumeUp();
    }
    public void volumeDownThroughController() {
        tvThroughController.volumeDown();
    }

    public String getConnectionTvName() {
        return connectionTvName;
    }
}
