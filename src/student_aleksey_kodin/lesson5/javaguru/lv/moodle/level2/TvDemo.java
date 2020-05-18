package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TvDemo {
    private final TvFrame tvframe = new TvFrame();
    private final Tv tv = new Tv("LG");

    public static void main(String[] args) {
        TvDemo tvdemo = new TvDemo();
        tvdemo.startDemo();
    }
    private void startDemo() {
        tvframe.runApp();
        tvframe.btnOn.addActionListener(new ButtonActiveListener());
        tvframe.btnOff.addActionListener(new ButtonActiveListener());
        tvframe.btnPrevChannel.addActionListener(new ButtonActiveListener());
        tvframe.btnNextChannel.addActionListener(new ButtonActiveListener());
        tvframe.btnVolumeDown.addActionListener(new ButtonActiveListener());
        tvframe.btnVolumeUp.addActionListener(new ButtonActiveListener());
        printInformation();
    }
    private void printInformation() {
        tvframe.setTextInfo("Tv class demo test:\n" + "Status Turn On - " + tv.getTvOn() + "\n" +
                            "Current channel - " + tv.getTvCurrentChannel() + "\n" +
                            "Current volume - " + tv.getCurrentVolume());
    }
    private class ButtonActiveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Turn ON" -> { tv.setTvOn(true); printInformation();}
                case "Turn OFF" -> { tv.setTvOn(false); printInformation();}
                case "Prev Channel" -> { tv.prevChannel(); printInformation();}
                case "Next Channel" -> { tv.nextChannel(); printInformation();}
                case "Volume Down" -> { tv.volumeDown(); printInformation();}
                case "Volume Up" -> { tv.volumeUp(); printInformation();}
            }
        }
    }
}
