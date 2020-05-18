package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level3;

import java.util.Objects;

class Tv {
    private static final int TV_FIRST_CHANNEL = 0;
    private static final int TV_LAST_CHANNEL = 999;
    private static final int TV_MIN_VOLUME = 0;
    private static final int TV_MAX_VOLUME = 100;
    private static final boolean TV_OFF_STATUS = false;

    private int currentChannel = TV_FIRST_CHANNEL;
    private int currentVolume = TV_MIN_VOLUME;
    private final String manufacturer;
    private boolean isTvOn = TV_OFF_STATUS;

    public Tv(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    void setTvOn(boolean isTvOn) {
        this.isTvOn = isTvOn;
    }
    boolean getTvOn() {
        return  isTvOn;
    }
    void nextChannel() {
        if (!isTvOn) {
            currentChannel = TV_FIRST_CHANNEL;
        }else if (getTvCurrentChannel() == TV_LAST_CHANNEL) {
            currentChannel = TV_FIRST_CHANNEL;
        } else {
            currentChannel += 1;
        }
    }
    void prevChannel() {
        if (!isTvOn) {
            currentChannel = TV_FIRST_CHANNEL;
        }else if (getTvCurrentChannel() == TV_FIRST_CHANNEL) {
            currentChannel = TV_LAST_CHANNEL;
        } else {
            currentChannel -= 1;
        }
    }
    String getManufacturer() {
        return manufacturer;
    }
    int getTvCurrentChannel() {
        return currentChannel;
    }
    int getCurrentVolume() {
        return currentVolume;
    }
    void volumeUp() {
        if (!isTvOn) {
            currentVolume = TV_MIN_VOLUME;
        }else if (volumeLessMaxVolume()) {
            currentVolume += 1;
        }else {
            currentVolume = TV_MAX_VOLUME;
        }
    }
    void volumeDown() {
        if (!isTvOn) {
            currentVolume = TV_MIN_VOLUME;
        }else if (volumeGreaterMinVolume()) {
            currentVolume -= 1;
        }else {
            currentVolume = TV_MIN_VOLUME;
        }
    }
    private boolean volumeLessMaxVolume() {
        return currentVolume < TV_MAX_VOLUME;
    }
    private boolean volumeGreaterMinVolume() {
        return currentVolume > TV_MIN_VOLUME;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isTvOn == tv.isTvOn &&
                manufacturer.equals(tv.manufacturer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, isTvOn);
    }
    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isTvOn=" + isTvOn +
                '}';
    }
}
