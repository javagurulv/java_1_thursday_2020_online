package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level2;
import javax.swing.*;
import java.awt.*;

class TvFrame {

    private JFrame frm;
    private JPanel pnPanel0;
    private GridBagConstraints gbcPanel0;
    private GridBagLayout gbPanel0;
    public JButton btnOn;
    public JButton btnOff;
    public JButton btnPrevChannel;
    public JButton btnNextChannel;
    public JButton btnVolumeDown;
    public JButton btnVolumeUp;
    private JTextArea txtInfo;

    void runApp() {
        createMainWindow();
        createPanel();
        createButtonOff();
        createButtonPrevChannel();
        createButtonNextChannel();
        createButtonOn();
        createButtonVolumeDown();
        createButtonVolumeUp();
        createTextInfoField();
        showWindow();
    }
    private void createButtonOff() {
        btnOff = new JButton("Turn OFF");
        gbcPanel0.gridx = 1;
        gbcPanel0.gridy = 0;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(btnOff, gbcPanel0);
        pnPanel0.add(btnOff);
    }
    private void createButtonPrevChannel() {
        btnPrevChannel = new JButton("Prev Channel");
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 1;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(btnPrevChannel, gbcPanel0);
        pnPanel0.add(btnPrevChannel);
    }
    private void createButtonNextChannel() {
        btnNextChannel = new JButton("Next Channel");
        gbcPanel0.gridx = 1;
        gbcPanel0.gridy = 1;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(btnNextChannel, gbcPanel0);
        pnPanel0.add(btnNextChannel);
    }
    private void createButtonOn() {
        btnOn = new JButton("Turn ON");
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 0;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(btnOn, gbcPanel0);
        pnPanel0.add(btnOn);
    }
    private void createButtonVolumeDown() {
        btnVolumeDown = new JButton("Volume Down");
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 2;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(btnVolumeDown, gbcPanel0);
        pnPanel0.add(btnVolumeDown);
    }
    private void createButtonVolumeUp() {
        btnVolumeUp = new JButton("Volume Up");
        gbcPanel0.gridx = 1;
        gbcPanel0.gridy = 2;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(btnVolumeUp, gbcPanel0);
        pnPanel0.add(btnVolumeUp);
    }
    private void createTextInfoField() {
        txtInfo = new JTextArea(2, 10);
        txtInfo.setFont(new Font("Arial", Font.PLAIN, 12));
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 3;
        gbcPanel0.gridwidth = 2;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(txtInfo, gbcPanel0);
        pnPanel0.add(txtInfo);
    }
    private void createMainWindow() {
        frm = new JFrame("Tv class test");
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frm.setSize(300,180);
        frm.setLocationRelativeTo(null);
        frm.setResizable(true);
        frm.setUndecorated(false);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        frm.setLocationByPlatform(true);
    }
    private void createPanel() {
        pnPanel0 = new JPanel();
        gbPanel0 = new GridBagLayout();
        gbcPanel0 = new GridBagConstraints();
        pnPanel0.setLayout( gbPanel0 );
    }
    private void showWindow() {
        frm.add(pnPanel0);
        frm.setVisible(true);
    }
    void setTextInfo(String text) {
        txtInfo.setText(text);
    }
}
